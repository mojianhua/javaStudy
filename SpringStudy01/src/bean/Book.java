package bean;

public class Book {
    private String bookName;
    private String author;

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
        return  author;
    }

    @Override
    public String toString(){
        return "[Book [bookName = " + bookName + ", author = " + author + "]";
    }
}
