1、引入配置，分别导入baomidou和lombok 
2、在entity里面创建实体类 
3、创建映射类，mapper 
4、在入口文件假如自动加载，MapperScan("com.jim.mapper")
5、自动填充，添加create_time和update_time两个字段
    5.1、添加实体类属性，命名特点，文件路径（handler/MyMetaObjectHandler.java）