import java.util.Random;
import java.util.Scanner;

public class NewBookTest {

    static int i= 47;

    public static void main(String[] args){
//        NewBook book = new NewBook("jj","科技",30.3);
//        System.out.println("book name" + book.getTitle());
//        System.out.println("book author" + book.getAuthor());
//        System.out.println("book price" + book.getPrice());



//        System.out.println("请输入要转换的摄氏度");
//        Scanner in = new Scanner(System.in);
//        //获取输入值
//        double celsius = in.nextDouble();
//        //要实例再调用
//        NewBookTest bookTest = new NewBookTest();
//        double fahrenheit = bookTest.getFahrenheit(celsius);
//        System.out.println("华氏结果是" + fahrenheit);

//        //实例化
//        NewBookTest book1 = new NewBookTest();
//        NewBookTest book2 = new NewBookTest();
//        book2.i = 60;
//        System.out.println("第一个实例对象调用变量 i 的结果：" + book1.i++);
//        book1.call();
//
//        System.out.println("第二个实例化对象调用变量 i 的结果：" + book2.i);
//        book2.call();

        //
//        String a = "123";
//        String b = "999";
//        a == b; "==" 是比较地址是否相等
        //a.equlas(b),是比较内容是否相同

//        String[] titles = {"jjj1","jjj2","jjj3"};
//        for(int i = 0; i < 5 ;i ++){
//            new NewBook(titles[new Random().nextInt(3)]);
//        }
//        System.out.println("总共销量了" + NewBook.getCounter() + "本");
    }

    //计算华氏
    public double getFahrenheit(double celsius){
        double fahrenheit = 1.8 * celsius + 32;
        return fahrenheit;
    }

    public void call(){
        System.out.println("调用call");
        for(int i = 0; i<3;i++){
            System.out.println(i + "");
            if(i == 2){
                System.out.println("\n");
            }
        }
    }}
