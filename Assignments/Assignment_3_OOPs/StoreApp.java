package Assignments.Assignment_3_OOPs;

/*
The StoreApp class will serve as the main entry point of the program.
It should initialize the Store and allow interactions through a simple console interface.
        •	Example Menu Options:
o	Register users (both customers and admins).
o	Display available products in the store.
o	Allow customers to add items to their cart and place orders.
o	Allow admins to manage (add, update, delete) products in the store.
o	Display each customer’s order history.
*/

import java.util.Scanner;

public class StoreApp {

    public static Scanner scanner = new Scanner(System.in);
    public static String input = "";

    public static void main(String[] args) {


        Store store = new Store();
        System.out.println("Hello and welcome to the Java Store");
        System.out.println(store.productList);

        while (input == "") {
            System.out.println("Are you a Customer or Admin?");
            input = scanner.nextLine();

            if (input.equalsIgnoreCase("Admin")) {
                this.adminUser();
                break;
            }
            if (input.equalsIgnoreCase("User")) {
                this.customerUser();
                break;
            }

            System.out.println("invalid input. Please confirm admin/customer");
            input = "";
        }


        static void adminUser () {

            System.out.println("Would you like to 1.Add  2.Remove 3.Update Products in the store?");
            input = scanner.nextLine();

            switch (input)
            case (1): {
                System.out.println("Please enter the new product name");
                store.addProduct();
            }
            case (2): {
                System.out.println("Please enter product to remove");
                store.removeProduct();
            }
            case (3): {
                System.out.println(" Please enter id of product to update");
            store.updateProductStock();
            }


        }
        static void customerUser () {


        }

    }

        /*// Check if customer or admin - admin needs to have key;

        //Admin - Allow admins to manage (1.add, 2. update, 3. delete) products in the store.
        Add-

        // Customer -> show him all products with displayProducts;
        -> displayProduct will show 1. Papaya 20 CAD
       -> Add a product to cart;
       -> displayCart to check what is the order and if they want to remove or replace something or place an order
       -> Once orders are placed -> save it into orders().
       -> display order history to view order history.





       // Register products and users (both customers and admins).
       // Allow admins to add, update, and delete products.
       // Enable customers to add items to their cart and place orders.
       // Display available products and each customer's order history.
*/

}
}
