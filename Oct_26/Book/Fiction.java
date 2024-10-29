package Oct_26.Book;

public class Fiction extends Book {
    String author = "J.K.Rowling";
    String title; //="Harry Potter";
    String id;// = "FICTION123090909";
    String genre;

   // Fiction fiction = new Fiction();

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



    //@Override
    public void printBook() {
        super.printBook();
      //  System.out.println("Book Name :" + this.title);
       // System.out.println("Author Name :" + this.author);
        //System.out.println("Genre :" + this.genre);
        //System.out.println("ISBN ID :" + this.id);
    }
}
