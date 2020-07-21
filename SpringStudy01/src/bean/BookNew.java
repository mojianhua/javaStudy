package bean;

public class BookNew {
    private String bookName;
    private String author;

    /**
     * 初始化方法
     * */
    public void bookInit(){
        System.out.println("新图书类的初始化方法........");
    }

    /**
     * 销毁方法
     * */
    public void bookDestory(){
        System.out.println("新图书类的销毁方法............");
    }

    public BookNew(){
        super();
        System.out.println("BookNew被创建...");
    }

    public void setBookName(String bookName){
        this.bookName = bookName;
    }

    public String getBookName(){
        return bookName;
    }

    public void setAuthor(String author){
        this.author = author;
    }

    public String getAuthor(){
        return author;
    }

    @Override
    public String toString(){
        return "[BookName [ bookName" + bookName + ", author" + author + "]";
    }
}
