package Assignments.Assignment_02_Arrays.ManagementSystems.ProductInventory;

import java.util.Arrays;
import java.util.Scanner;

public class ProductInventoryManagementSystem {

    //
    public static String[] products;
    public static String[] prices;
    public static String[][] productAndPrice;
    public static String input; // to accept all user inputs
    public static Scanner scanner = new Scanner(System.in);

    //main method
    public static void main(String[] args) {

        inputProductsAndPrices();
        displayPrice();
        retrievePrice();

    }

    //method to initialize arrays for fruits and pricePerKG

    public static void inputProductsAndPrices() {
        System.out.println("Enter Number of Products :");
        int inputNum = scanner.nextInt();

        products = new String[inputNum];
        prices = new String[inputNum];
        productAndPrice = new String[inputNum][2];

        //For loop
        for (int i = 0, j = i + 1; i < products.length; i++, j++) {
            System.out.println("Enter Product " + j + " Name");
            input = scanner.nextLine();
            products[i] = input;
            System.out.println("Enter Price of Product " + j + " -  " + input + " :");
            input = scanner.nextLine();
            prices[i] = input;

            productAndPrice[i][0] = products[i];
            productAndPrice[i][1] = prices[i];
        }//For loop closed
    }

    public static void retrievePrice() {


        boolean found = false, search = true;

        while (search) {

            System.out.println("Please enter the product you want to find the cost for :");
            input = scanner.nextLine();

            for (int i = 0; i < products.length; i++) {
                if (input.equalsIgnoreCase(products[i])) {
                    System.out.println("Product " + products[i] + " costs " + prices[i] + " CAD");
                    found = true;
                    break;
                }
            }
            if (!found) {
                System.out.println("Product is not listed.");
            }
            search = false;

            System.out.println("Would you like to search another product?");
            input = scanner.nextLine();

            if (input.equalsIgnoreCase("yes")) {
                search = true;
                found = false;
            }
        }
        System.out.println("Thank you!");
    }

    public static void displayPrice() {
            /*System.out.println(Arrays.toString(fruits));
            System.out.println(Arrays.toString(pricePerKG));*/
        System.out.println(Arrays.deepToString(productAndPrice));
    }
}