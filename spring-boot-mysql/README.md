.spring boot升级到2.0之后，配置数据源会遇到这样的错误：

jdbcUrl is required with driverClassName.
Cause: java.lang.IllegalArgumentException: dataSource or dataSourceClassName or jdbcUrl is required.] with root cause
解决：
在application配置文件中配置一下
1.0 配置数据源的过程中主要是写成：spring.datasource.url 和spring.datasource.driverClassName。


而在2.0升级之后需要变更成：spring.datasource.jdbc-url和spring.datasource.driver-class-name
2.配置数据源时还会遇到这个问题：
Failed to configure a DataSource: 'url' attribute is not specified and no embedded datasource could be configured.
Reason: Failed to determine a suitable driver class
解决：
需要把spring boot自动初始化DataSource相关的代码禁止掉，具体两种方式。
方式一：
在application启动类加红框标记的这句话

@SpringBootApplication(exclude = { DataSourceAutoConfiguration.class, DataSourceTransactionManagerAutoConfiguration.class })
在这里插入图片描述
方式二：
在application配置文件，注意！是放在spring下的，与datasource对齐！

autoconfigure:
    exclude: org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration,org.springframework.boot.autoconfigure.jdbc.DataSourceTransactionManagerAutoConfiguration
    
<!------------------------------------------------------------------------------->
druid调用

1、application.yml数据库配置
spring:
  datasource:
    username: root
    password: root
    url: jdbc:mysql://127.0.0.1:3306/jdbc_template
    driver-class-name: com.mysql.jdbc.Driver
    type: com.alibaba.druid.pool.DruidDataSource
        type: com.alibaba.druid.pool.DruidDataSource
        initialSize: 5
        maxAction: 5
        maxWait: 60000
        timeBetweenEvictionRunsMillis: 600000
        minEvictableIdleTimeMillis: 30000
        validationQuery: SELECT 1 FROM DUAL
        testdationQuery: true
        testOnBorrow: false
        testOnReturn: false
        poolPreparedStatements: true
        #配置监控统计拦截的filters，去掉后监控界面sql无法统计，‘wall’用于防火墙
        filters: stat,wall,log4j
        maxPoolPreparedStatementPerConnectionSize: 20
        useGlobalDataSourceStat: true
        connectionProperties: druid.stat.mergeSql=true;druid.stat.slowSqlMillis=5000
druid配置说明
DRUID是阿里巴巴开源平台上一个数据库连接池实现，它结合了C3P0、DBCP、PROXOOL等DB池的优点，同时加入了日志监控，可以很好的监控DB池连接和SQL的执行情况，可以说是针对监控而生的DB连接池(据说是目前最好的连接池,不知道速度有没有BoneCP快)。    
其中：DruidDataSource配置兼容DBCP，但个别配置的语意有所区别。
配置	缺省值	说明
name		    配置这个属性的意义在于，如果存在多个数据源，监控的时候可以通过名字来区分开来。如果没有配置，将会生成一个名字，格式是："DataSource-" + System.identityHashCode(this). 另外配置此属性至少在1.0.5版本中是不起作用的，强行设置name会出错。详情-点此处。
url		        连接数据库的url，不同数据库不一样。例如：
username		连接数据库的用户名
password		连接数据库的密码。如果你不希望密码直接写在配置文件中，可以使用ConfigFilter。详细看这里
driverClassName	根据url自动识别	这一项可配可不配，如果不配置druid会根据url自动识别dbType，然后选择相应的driverClassName
initialSize	0	初始化时建立物理连接的个数。初始化发生在显示调用init方法，或者第一次getConnection时
maxActive	8	最大连接池数量
maxIdle	8	    已经不再使用，配置了也没效果
minIdle		    最小连接池数量
maxWait		    获取连接时最大等待时间，单位毫秒。配置了maxWait之后，缺省启用公平锁，并发效率会有所下降，如果需要可以通过配置useUnfairLock属性为true使用非公平锁。
poolPreparedStatements	false	是否缓存preparedStatement，也就是PSCache。PSCache对支持游标的数据库性能提升巨大，比如说oracle。在mysql下建议关闭。
maxPoolPreparedStatementPerConnectionSize	-1	要启用PSCache，必须配置大于0，当大于0时，poolPreparedStatements自动触发修改为true。在Druid中，不会存在Oracle下PSCache占用内存过多的问题，可以把这个数值配置大一些，比如说100
validationQuery		用来检测连接是否有效的sql，要求是一个查询语句，常用select 'x'。如果validationQuery为null，testOnBorrow、testOnReturn、testWhileIdle都不会起作用。
validationQueryTimeout		单位：秒，检测连接是否有效的超时时间。底层调用jdbc Statement对象的void setQueryTimeout(int seconds)方法
testOnBorrow	true	申请连接时执行validationQuery检测连接是否有效，做了这个配置会降低性能。
testOnReturn	false	归还连接时执行validationQuery检测连接是否有效，做了这个配置会降低性能。
testWhileIdle	false	建议配置为true，不影响性能，并且保证安全性。申请连接的时候检测，如果空闲时间大于timeBetweenEvictionRunsMillis，执行validationQuery检测连接是否有效。
keepAlive	false
（1.0.28）	连接池中的minIdle数量以内的连接，空闲时间超过minEvictableIdleTimeMillis，则会执行keepAlive操作。
timeBetweenEvictionRunsMillis	1分钟（1.0.14）	有两个含义：
1) Destroy线程会检测连接的间隔时间，如果连接空闲时间大于等于minEvictableIdleTimeMillis则关闭物理连接。
2) testWhileIdle的判断依据，详细看testWhileIdle属性的说明
numTestsPerEvictionRun	30分钟（1.0.14）	不再使用，一个DruidDataSource只支持一个EvictionRun
minEvictableIdleTimeMillis		连接保持空闲而不被驱逐的最小时间
connectionInitSqls		物理连接初始化的时候执行的sql
exceptionSorter	根据dbType自动识别	当数据库抛出一些不可恢复的异常时，抛弃连接
filters		属性类型是字符串，通过别名的方式配置扩展插件，常用的插件有：
监控统计用的filter:stat
日志用的filter:log4j
防御sql注入的filter:wall
proxyFilters		类型是List<com.alibaba.druid.filter.Filter>，如果同时配置了filters和proxyFilters，是组合关系，并非替换关系
DruidDataSource false 合并多个DruidDataSource的监控数据
spring.datasource.druid.connectionProperties:druid.stat.mergeSql=true;druid.stat.slowSqlMillis=5000     通过connectProperties属性来打开mergeSql功能；慢SQL记录

2、写入配置文章，本项目druid配置文件是在config/druidConfig.java
3、在pom.xml引入log4j配置
<!-- https://mvnrepository.com/artifact/log4j/log4j -->
<dependency>
    <groupId>log4j</groupId>
    <artifactId>log4j</artifactId>
    <version>1.2.17</version>
</dependency>

4、写入log4j配置，本项目log4j配置是在resource中的log4j.properties
        