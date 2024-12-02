package Assignments.Assignment_02_Arrays.ManagementSystems.GroceryStore;/*
package ManagementSystems.GroceryStore;

import java.util.Arrays;
import java.util.Scanner;


public class GroceryStore {

    public static String[] fruits;
    public static Double[] pricePerKG;
    public static String[][] fruitsAndPrice;
    public static String input; // to accept all string inputs
    public static double inputDouble; // to accept all user numeric inputs
    public static Scanner scanner = new Scanner(System.in);
    public static double totalCost;
    public static int index;


    //main method
    public static void main(String[] args) {

        inputFruitsAndPrices();
        displayFruitCatalogue();
        retrievePrice();
        costByWeight();

    }

    //method to buy fruits per weight
    public static void costByWeight() {
        boolean inputCheck = true;

        System.out.println("What do you want to buy?");
        input = scanner.nextLine();

        while (inputCheck) {
            if (findIndexOfFruit(input)) {
                System.out.println("How much do you want to buy " + input + " in kg?");
                inputDouble = scanner.nextDouble();
                scanner.nextLine();

                totalCost = pricePerKG[index] * inputDouble;

                System.out.println("That would be " + totalCost + " CAD");
                inputCheck = false;
                break;
            } else {
                System.out.println("Sorry we do not have the student. Please enter another fruit.");
                inputCheck = true;
            }
        }
    }


    //method to initialize arrays for fruits and pricePerKG

    public static void inputFruitsAndPrices() {
        System.out.println("Enter Number of Fruits :");
        int inputNum = scanner.nextInt();

        fruits = new String[inputNum];
        pricePerKG = new Double[inputNum];
        fruitsAndPrice = new String[inputNum][2];

        //For loop
        for (int i = 0, j = i + 1; i < fruits.length; i++, j++) {
            System.out.println("Enter Fruit " + j + " Name");
            input = scanner.nextLine();

            fruits[i] = input;
            System.out.println("Enter Price per kg of Fruit " + j + " -  " + input + " :");
            inputDouble = scanner.nextDouble();
            scanner.nextLine();

            pricePerKG[i] = inputDouble;

            fruitsAndPrice[i][0] = fruits[i];
            fruitsAndPrice[i][1] = String.valueOf(pricePerKG[i]);
        }//For loop closed
    }


    public static void retrievePrice() {

        boolean found = false, search = true;

        while (search) {

            System.out.println("Please enter the product you want to find the cost for :");
            input = scanner.nextLine();

            for (int i = 0; i < fruits.length; i++) {
                if (input.equalsIgnoreCase(fruits[i])) {
                    System.out.println("Product " + fruits[i] + " costs " + pricePerKG[i] + " CAD");
                    found = true;
                    break;
                }
            }
            if (!found) {
                System.out.println("Fruit is not listed.");
            }
            search = false;

            System.out.println("Would you like to search another Fruit?");
            input = scanner.nextLine();

            if (input.equalsIgnoreCase("yes")) {
                search = true;
                found = false;
            }
        }
        System.out.println("Thank you!");
    }

    public static void displayFruitCatalogue() {
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
        return false;  // Indicates the title wasn't found
    }
}

*/
