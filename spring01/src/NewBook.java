public class NewBook {
    private String title;
    private String author;
    private double price;
    private static int counter = 0;

//    //利用构造方法初始化域
//    public NewBook(String title,String author,double price){
//        this.title = title;
//        this.author = author;
//        this.price = price;
//    }

    //获取书名
    public String getTitle(){
        return title;
    }

    //获取作者
    public String getAuthor(){
        return author;
    }

    //获取价格
    public double getPrice(){
        return price;
    }

    //计算书本销售量
    public NewBook(String title){
        System.out.println("售出图书：" + title);
        counter++;
    }

    public static int getCounter(){
        return counter;
    }
}
