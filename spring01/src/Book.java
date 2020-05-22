
public class Book {
   private int id;
   private String name;
   private String category;
    public String getName(){
    int id = 0;
    //调用类中其他方法
    setName("java");
    return id + this.name;
    }

    //权限修饰符 返回值类型 方法名(参数类型 参数)
    //无返回值可用void关键字表示
    private void setName(String name){
       this.name = name;
    }

    public Book getBook(){
       return this;
    }

    static double PI = 3.14;
    static int id1;

    public static void method1(){

    }

    public void method2(){
        //调用静态变量
        System.out.println(Book.id1);
        System.out.println(Book.PI);
        //调用静态方法
        Book.method1();
    }

//    //在类中定义一个静态方法
//    public static Book method3(){
//        //静态方法中不能调用非静态关键词
////        method2();
//        //静态方法中不可以直接使用非静态方法
////        return this;
//    }

//    //如果在执行类时，希望先执行的初始化动作，可以使用static定义一个镜铁区
//    static {
//        //比构造函数更早执行预设变量
//    }
}