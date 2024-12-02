package Assignments.Assignment_02_Arrays.ManagementSystems;/*

package ManagementSystems;
import java.util.Arrays;
import java.util.Scanner;

public class FormatForProductInput {
    public static String[] item;
    public static String[] productPrice;
    public static String[][] itemAndPrice;
    public static String input; // to accept all user inputs
    public static Double numInput; // to accept all numeric user inputs
    public static Scanner scanner = new Scanner(System.in);
    public static int index = -1;  // -1 indicates no valid index found initially

    public displayItemsCatalogue() {
        System.out.println("Updated Items Catalogue :");
        System.out.println(Arrays.deepToString(itemAndPrice));
    }

    public static void retrievePrice() {
        public static void retrievePrice () {
            boolean search = true;
            while (search) {
                System.out.println("Please enter the student you want to find the cost for:");
                input = scanner.nextLine();
                boolean found = false;

                for (int i = 0; i < s.length; i++) {
                    if (input.equalsIgnoreCase(items[i])) {
                        System.out.println("student : " + items[i] + " costs " + pricePerKG[i] + " CAD per kg.");
                        found = true;
                        break;
                    }
                }

                if (!found) {
                    System.out.println("Item is not listed.");
                }

                System.out.println("Would you like to search for another student? (yes/no)");
                input = scanner.nextLine();

                if (!input.equalsIgnoreCase("yes")) {
                    search = false;
                    System.out.println("Thank you!");
                }
            }
        }

    }

    private static boolean findIndexOfItem(String itemName) {
    }

    // Method to find the index of items
    private static boolean findIndexOfItem(String itemName) {
        for (int i = 0; i < item.length; i++) {
            if (itemName.equalsIgnoreCase(item[i])) {
                index = i;
                return true;
            }
        }
    }
}
*/
