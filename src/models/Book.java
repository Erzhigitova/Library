package models;

public class Book {
    private String author;
    private String name;

    public Book(){

    }

    public Book(String author, String name) {
        this.author = author;
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return author + " " + name;
    }
    public String booksInfo(Book[] books){
        String info ="";
        for(Book b: books){
            info+= b.toString() + ", ";
        }
        return info;
    }

}
