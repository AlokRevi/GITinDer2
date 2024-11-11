package ClassFiles.Book;

public class Fiction extends Book {
    //default constructor
    public Fiction() {
        super("unknown","unknown","Fiction","unknown");
    }

    // Parameterized constructor - String
    public Fiction(String title) {
        super(title,"unknown","Fiction","unknown");
    }

    // Parameterized constructor - String, String
    public Fiction(String title, String author) {
        super(title,author,"Fiction","unknown");
    }

    // Parameterized constructor - String, String ,String
    public Fiction(String title, String author, String id) {
        super(title,author,"Fiction",id);
    }

    @Override
    public void printBook() {
        super.printBook();

    }
}
