package Assignments.Assignment_02_Arrays.ManagementSystems.GroceryStore;/*
package ManagementSystems.GroceryStore;

import java.util.Arrays;
import java.util.Scanner;

public class GroceryStore_V2 {

    public static String[] fruits;
    public static Double[] pricePerKG;
    public static String[][] fruitsAndPrice;
    public static String input; // to accept all string inputs
    public static double inputDouble; // to accept all user numeric inputs
    public static Scanner scanner = new Scanner(System.in);
    public static double totalCost;
    public static int index;

    // main method
    public static void main(String[] args) {
        inputFruitsAndPrices();
        displayFruitCatalogue();
        retrievePrice();
        costByWeight();
    }

    // Method to buy fruits per weight
    public static void costByWeight() {
        System.out.println("What do you want to buy?");
        input = scanner.nextLine();

        while (true) {
            if (findIndexOfFruit(input)) {
                System.out.println("How much " + input + " would you like to buy in kg?");
                inputDouble = scanner.nextDouble();
                scanner.nextLine();  // Clear the newline character after nextDouble()

                totalCost = pricePerKG[index] * inputDouble;
                System.out.println("That would be " + totalCost + " CAD");
                break;
            } else {
                System.out.println("Sorry, we do not have " + input + ". Please enter another fruit.");
                input = scanner.nextLine();  // Prompt for a new fruit productName
            }
        }
    }

    // Method to initialize arrays for fruits and pricePerKG
    public static void inputFruitsAndPrices() {
        System.out.println("Enter the number of fruits:");
        int inputNum = scanner.nextInt();
        scanner.nextLine();  // Clear the newline character after nextInt()

        fruits = new String[inputNum];
        pricePerKG = new Double[inputNum];
        fruitsAndPrice = new String[inputNum][2];

        for (int i = 0; i < fruits.length; i++) {
            System.out.println("Enter Fruit " + (i + 1) + " Name:");
            fruits[i] = scanner.nextLine();

            System.out.println("Enter Price per kg of " + fruits[i] + ":");
            pricePerKG[i] = scanner.nextDouble();
            scanner.nextLine();  // Clear the newline character after nextDouble()

            fruitsAndPrice[i][0] = fruits[i];
            fruitsAndPrice[i][1] = String.valueOf(pricePerKG[i]);
        }
    }

    // Method to retrieve the attendance of a specific fruit
    // Method to display all fruits and their prices

    public static void retrievePrice() {
        boolean search = true;

        while (search) {
            System.out.println("Please enter the fruit you want to find the cost for:");
            input = scanner.nextLine();
            boolean found = false;

            for (int i = 0; i < fruits.length; i++) {
                if (input.equalsIgnoreCase(fruits[i])) {
                    System.out.println("Fruit: " + fruits[i] + " costs " + pricePerKG[i] + " CAD per kg.");
                    found = true;
                    break;
                }
            }

            if (!found) {
                System.out.println("Fruit is not listed.");
            }

            System.out.println("Would you like to search for another fruit? (yes/no)");
            input = scanner.nextLine();

            if (!input.equalsIgnoreCase("yes")) {
                search = false;
                System.out.println("Thank you!");
            }
        }
    }
    public static void displayFruitCatalogue() {
        System.out.println("Fruit Catalogue:");
        System.out.println(Arrays.deepToString(fruitsAndPrice));
    }

    // Method to find the index of a fruit
    private static boolean findIndexOfFruit(String fruitName) {
        for (int i = 0; i < fruits.length; i++) {
            if (fruitName.equalsIgnoreCase(fruits[i])) {
                index = i;
                return true;
            }
        }
        return false;  // Indicates the fruit wasn't found
    }
}

*/
