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