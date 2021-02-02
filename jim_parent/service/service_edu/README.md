1、编写控制器
2、编写启动类，EduApplication
3、创建配置类，配置mapper扫描和其他
4、统一返回的json时间格式，在配置文件（resources/application.yml）添加
5、安装逻辑删除插件，保存到EduConfig中的ISqlInjector
    5.1、然后在对应的逻辑删除字段加上@TableField修饰器
6、访问swagger----http://localhost:8001/swagger-ui.html