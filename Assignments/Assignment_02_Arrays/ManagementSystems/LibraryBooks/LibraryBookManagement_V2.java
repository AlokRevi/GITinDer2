package Assignments.Assignment_02_Arrays.ManagementSystems.LibraryBooks;
import java.util.Arrays;
import java.util.Scanner;

public class LibraryBookManagement_V2 {

        public static String[] books;
        public static String[] authors;
        public static String[][] authorsAndBooks;
        public static String input; // to accept all user inputs
        public static Scanner scanner = new Scanner(System.in);
        public static int bookIndex = -1;  // -1 indicates no valid index found initially

        // main method
        public static void main(String[] args) {
            inputBookTitles();
            displayBookDetails();
            findTitleOrAuthor();
            replaceBook();
        }

        // method to initialize arrays for books and authors
        public static void inputBookTitles() {
            System.out.println("Enter Number of Titles:");
            int inputNum = scanner.nextInt();
            scanner.nextLine();  // Clear the newline character after nextInt()

            books = new String[inputNum];
            authors = new String[inputNum];
            authorsAndBooks = new String[inputNum][2];

            for (int i = 0; i < books.length; i++) {
                System.out.println("Enter Book " + (i + 1) + " Title:");
                books[i] = scanner.nextLine();

                System.out.println("Enter Author of the Title - " + books[i] + ":");
                authors[i] = scanner.nextLine();

                authorsAndBooks[i][0] = books[i];
                authorsAndBooks[i][1] = authors[i];
            }
        }

        // Method to find and display a book or author based on user input
        public static void findTitleOrAuthor() {
            boolean search = true;

            while (search) {
                System.out.println("Please enter the author or title you want to find:");
                input = scanner.nextLine();
                boolean found = false;

                for (int i = 0; i < books.length; i++) {
                    if (input.equalsIgnoreCase(books[i]) || input.equalsIgnoreCase(authors[i])) {
                        System.out.println("Book Title: " + books[i] + ", Author Name: " + authors[i]);
                        found = true;
                        break;
                    }
                }

                if (!found) {
                    System.out.println("Item not found.");
                }

                System.out.println("Would you like to search for another title or author? (yes/no)");
                input = scanner.nextLine();

                if (!input.equalsIgnoreCase("yes")) {
                    search = false;
                    System.out.println("Thank you!");
                }
            }
        }

        // Method to find the index of a book title (used for replacing a book)
        public static boolean findIndexOfTitle(String title) {
            for (int i = 0; i < books.length; i++) {
                if (title.equalsIgnoreCase(books[i])) {
                    bookIndex = i;
                    return true;
                }
            }
            return false;  // Indicates the title wasn't found
        }

        // Method to replace a book in the catalog
        public static void replaceBook() {
            System.out.println("Would you like to replace a book in the Library? (yes/no)");
            input = scanner.nextLine();

            if (input.equalsIgnoreCase("yes")) {
                System.out.println("Please enter the title you want to replace:");
                input = scanner.nextLine();

                if (findIndexOfTitle(input)) {
                    System.out.println("Please enter the new incoming book Title:");
                    books[bookIndex] = scanner.nextLine();

                    System.out.println("Please enter the new Author Name:");
                    authors[bookIndex] = scanner.nextLine();

                    // Update the authorsAndBooks array
                    authorsAndBooks[bookIndex][0] = books[bookIndex];
                    authorsAndBooks[bookIndex][1] = authors[bookIndex];

                    displayBookDetails();
                } else {
                    System.out.println("The title you want to replace was not found.");
                }
            }

            System.out.println("Thank you!");
        }

        // Method to display all book and author details
        public static void displayBookDetails() {
            System.out.println("Here is the updated Catalogue:");
            System.out.println(Arrays.deepToString(authorsAndBooks));
        }
    }


