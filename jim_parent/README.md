一、项目开发阶段
1、编写控制器
2、编写启动类，EduApplication
3、创建配置类，配置mapper扫描和其他
4、统一返回的json时间格式，在配置文件（resources/application.yml）添加
5、安装逻辑删除插件，保存到EduConfig中的ISqlInjector
    5.1、然后在对应的逻辑删除字段加上@TableField修饰器

二、公共类
1、创建公共模块，整合swagger，为了所有模块都能进行使用
2、在jim_parent创建子模块common,在common创建子模块service_base
3、在service_base创建配置类
4、在service的pom.xml引入service_base依赖
5、去service_edu启动类添加注解，设置包扫描规则
    @SpringBootApplication
    @ComponentScan(basePackages = {"com.jim"})
    public class EduApplication {
6、访问swagger----http://localhost:8001/swagger-ui.html
    6.1、swagger2生成API接口文档
        6.1.1、定义在类上@API
        6.1.2、定义在方法上：@ApiOperation
        6.1.3、定义在参数上：@ApiParam
7、定义json返回固定格式
    7.1、在common模块创建子模块common_utils
    7.2、在common_utils里面创建返回状态码，common_utils.com.jim.commonutils.ResultCode
    7.3、在common_utils里面创建返回结果R，common_utils.com.jim.commonutils.R
    7.4、在service的pom.xml引入common_utils依赖