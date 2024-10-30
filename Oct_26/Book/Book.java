package Oct_26.Book;

import java.sql.SQLOutput;

public class Book {
    String title;
    String author;
    String genre;
    String id;

    public Book() {
        title = "unknown";
        author = "unknown";
        genre = "unknown";
        id = "unknown";
    }

    //Parameterized constructor - String
    public Book(String title) {
        this.title = title;
        author = "unknown";
        genre = "unknown";
        id = "unknown";
    }

    //Parameterized constructor - String, String

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
        genre = "unknown";
        id = "unknown";

    }

    //Parameterized constructor - String, String, String
    public Book(String title, String author, String genre) {
        this.title = title;
        this.author = author;
        this.genre = genre;
        id = "unknown";
    }

    //Parameterized constructor - String, String, String, String
    public Book(String title, String author, String genre, String id) {
        this.title = title;
        this.author = author;
        this.genre = genre;
        this.id = id;
    }

    public void printBook() {
        System.out.println("Book Name : " + this.title);
        System.out.println("Author    : " + this.author);
        System.out.println("Genre     : " + this.genre);
        System.out.println("ISBN      : " + this.id);
    }

}
