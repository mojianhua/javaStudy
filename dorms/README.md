1、初始化项目
2、新建文件目录
    entity(实体文件夹，用于映射数据库字段)
    mapper（dao层，类似model映射的xml对应sql）
    service(中间层)
    controller(控制器)
3、如果出现：Failed to load property source from 'file:/F:/javaStudy/dorms/target/classes/application.yml' (class
   解：则注意yml的编码，转成utf-8
4、如果出现：Field userService in com.dorms.controller.UserController required a bean of type 'com.dorms.service.UserService' that could not be found.
   解：在service里面添加@service修饰器