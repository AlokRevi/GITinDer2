
package Assignments.Assignment_02_Arrays.ManagementSystems.LibraryBooks;

import java.util.Arrays;
import java.util.Scanner;

public class LibraryBookManagement {

    public static String[] books;
    public static String[] authors;
    public static String[][] authorsAndBooks;
    public static String input; // to accept all user inputs
    public static Scanner scanner = new Scanner(System.in);
    public static int bookIndex;

    //main method
    public static void main(String[] args) {
        inputBookTitles();
        displayBookDetails();
        findIndexOfTitle();
        replaceBook();
    }

    //method to initialize arrays for fruits and pricePerKG

    public static void inputBookTitles() {
        System.out.println("Enter Number of Titles :");
        int inputNum = scanner.nextInt();
        scanner.nextLine();

        books = new String[inputNum];
        authors = new String[inputNum];
        authorsAndBooks = new String[inputNum][2];

        //For loop
        for (int i = 0, j = i + 1; i < books.length; i++, j++) {
            System.out.println("Enter Book " + j + " Title");
            input = scanner.nextLine();
            books[i] = input;

            System.out.println("Enter Author of the Title - " + input + " :");
            input = scanner.nextLine();
            authors[i] = input;

            authorsAndBooks[i][0] = books[i];
            authorsAndBooks[i][1] = authors[i];
        }//For loop closed
    }


    //Method to retrieve Title or Author info if either are entered.
    public static void findIndexOfTitle() {

        boolean found = false, search = true;

        while (search) {

            System.out.println("Please enter the author or title you want to find :");
            input = scanner.nextLine();

            for (int i = 0; i < books.length; i++) {
                if (input.equalsIgnoreCase(books[i]) || (input.equalsIgnoreCase(authors[i]))) {
                    System.out.println("Book Title :" + books[i] + " Author productName :" + authors[i]);
                    found = true;
                    break;
                }
            }
            if (!found) {
                System.out.println("Item not found.");
            }
            search = false;

            System.out.println("Would you like to search for another title or author? (yes/no)");
            input = scanner.nextLine();

            if (input.equalsIgnoreCase("yes")) {
                search = true;
                found = false;
            }
        }
        System.out.println("Thank you!");
    }

    // Method to retrieve index of inputed title
    public static void findIndexOfTitle(String title) {

        boolean found = false, search = true;

        input = title;

        for (int i = 0; i < books.length; i++) {
            if (input.equalsIgnoreCase(books[i])) {
                System.out.println("Book Title :" + books[i] + " Author productName :" + authors[i]);
                found = true;
                bookIndex = i;
                break;
            }
        }
        System.out.println("Thank you!");
    }

    public static void retrieveTitleToReplace() {


        boolean found = false, search = true;

        while (search) {
            System.out.println("Please enter the title you want to replace :");
            input = scanner.nextLine();

            for (int i = 0; i < books.length; i++) {
                if (input.equalsIgnoreCase(books[i]) || (input.equalsIgnoreCase(authors[i]))) {
                    System.out.println("Book Title :" + books[i] + " Author productName :" + authors[i]);
                    found = true;
                    bookIndex = i;
                    break;
                }
            }
            if (!found) {
                System.out.println("Item not found.");
            }
            search = false;

            System.out.println("Would you like to search for another title or author? (yes/no)");
            input = scanner.nextLine();

            if (input.equalsIgnoreCase("yes")) {
                search = true;
                found = false;
            }
        }
        System.out.println("Thank you!");
    }

    public static void displayBookDetails() {
        /*System.out.println(Arrays.toString(books));
        System.out.println(Arrays.toString(authors));*/
        System.out.println("Here is the updated Catalogue");
        System.out.println(Arrays.deepToString(authorsAndBooks));
    }

    public static void replaceBook() {
        System.out.println("Would you like to replace a book in the Library?(yes/no)");
        input = scanner.nextLine();
        if (input.equalsIgnoreCase("yes")) {
            System.out.println("Please enter the title you want to replace :");
            input = scanner.nextLine();
            findIndexOfTitle(input);
            System.out.println("Please enter the new incoming book Title ");
            books[bookIndex] = scanner.nextLine();
            System.out.println("Please enter Author Name");
            authors[bookIndex] = scanner.nextLine();
            authorsAndBooks[bookIndex][0] = books[bookIndex];
            authorsAndBooks[bookIndex][1] = authors[bookIndex];
            displayBookDetails();
        }
        System.out.println("Thank you!");
    }
}