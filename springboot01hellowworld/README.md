一、配置文件的加载位置（跟目录是resources）
    SpringBoot启动会扫描以下位置的application.properties或者application.yml文件作为配置文件
    -file:./config/
    -file:./
    -classpath:/config/
    -classpath:/
    优先级由高到低，高优先级会覆盖低优先级
    我们可以通过在application.properties里面的spring.config.location来改变默认的配置文件
    项目打包好可以运行命令来指定配置文件的新位置如下：
    java -jar springxxxx.jar --spring.config.location=配置文件路径

二、外部加载顺序
    2.1 命令行：java -jar spring-boot-xx.jar --service.port=8087 --server.context-path=/abc
    2.2 jar包外的application-{profile}.properties
    2.2 jar包外的application-{profile}.properties
    2.3 jar包外的application.properties
    2.4 jar包外的application.properties

三、日志类
   日志输出格式：
    %d表示日期时间，
    %thread表示线程名
    %-Slevel:级别从左显示5个字符宽度
    %logger{50} 表示logger名字最长50个字符，否则按照句点分隔
    %msg:日志消息
    %n:换行符

四、静态资源类
    4.1、所有/webjars/**,都去classpath:/META-INF/resources/webjars/找资源；
        webjars:以jar包的方式引入静态资源；http://www.webjars.org
        访问路径：http://localhost:8081/webjars/jquery/3.1.1/jquery.min.js
        如果有访问路径就变成并且访问路径是dev：http://localhost:8081/dev/webjars/jquery/3.1.1/jquery.min.js
        访问路径：
        1、classpath:/META-INF/resources
        2、classpath:/resources
        3、classpath:/static/
        4、classpath:/public/
        5、"\";当前项目的跟路径        
    4.2、欢迎页，静态文件架里面的所以index.html页码
    4.3、所有的favicon.ico都是静态资源文件下找的
   
    