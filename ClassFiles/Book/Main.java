package ClassFiles.Book;

public class Main {
    public static void main(String[] args) {

        Book myBook = new Book();
        myBook.printBook();

        System.out.println("....");

        Fiction myfiction = new Fiction();
        myfiction.printBook();

        System.out.println("....");

        //NonFiction nonFiction = new NonFiction();
        //nonFiction.printBook();
    }
}
