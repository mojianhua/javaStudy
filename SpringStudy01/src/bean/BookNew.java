package bean;

public class BookNew {
    private String bookName;
    private String author;

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
