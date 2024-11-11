package ClassFiles.Book;

public class NonFiction extends Book {
    String author;// = "Brene Brown";
    String title;// = "Daring Greatly";
    String id; // "ISBN 1212123121101";
    String genre;// = "Self Help";

    //NonFiction nonFiction = new NonFiction();

    //default constructor
    public NonFiction() {
    }

    public NonFiction(String title, String author, String title1, String id, String genre) {
        super(title);
        this.author = author;
        this.title = title1;
        this.id = id;
        this.genre = genre;
    }

    public NonFiction(String title, String author, String author1, String title1, String id, String genre) {
        super(title, author);
        this.author = author1;
        this.title = title1;
        this.id = id;
        this.genre = genre;
    }

    public NonFiction(String title, String author, String genre, String author1, String title1, String id, String genre1) {
        super(title, author, genre);
        this.author = author1;
        this.title = title1;
        this.id = id;
        this.genre = genre1;
    }

    public NonFiction(String title, String author, String genre, String id, String author1, String title1, String id1, String genre1) {
        super(title, author, genre, id);
        this.author = author1;
        this.title = title1;
        this.id = id1;
        this.genre = genre1;
    }

    @Override
    public void printBook() {
        System.out.println("Book Name :" + this.title);
        System.out.println("Author Name :" + this.author);
        System.out.println("Genre :" + this.genre);
        System.out.println("ISBN ID :" + this.id);

    }
}
