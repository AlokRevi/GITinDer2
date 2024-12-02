package Assignments_3_OOPS_4thAttempt;

import java.util.Scanner;

public class StoreAppp {

    public static void main(String[] args) {

        Product product = new Product();
        Store store = new Store();
        Admin admin = new Admin();
        Customer customer = new Customer();

        String userID = "";
        String userName = "";
        String userId = "";
        String userEmail = "";
        String userPhone = "";

        String productName = "";
        String productId = "";
        int productQuantity = 0;
        double productPrice = 0.0;


        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Store. Select or 1-Admin or 2-Customer? 0-Exit App");
        int inputNum = scanner.nextInt();

        boolean selectUserLoop = true;
        do {
            switch (inputNum) {
                case 2: // For Customer
                    System.out.println("Are you 1. New Customer OR 2.A Returning Customer"); //Customer must be able to register.
                    break;
                case 1: // For Admin - call Admin()
                    boolean enterAdminLoop = true;
                    do {
                        System.out.println("Enter Admin ID \n or type Exit to Exit to Main Menu"); // Admin should have Admin ID.
                        String inputString = scanner.nextLine();

                        boolean selectProdUserListLoop = true;
                        if (store.authenticateAdmin(inputString)) {
                            do {
                                System.out.println("Admin Authenticated.\n Press 1- To Modify Product List Below \n2- To View User List \n9 -To Exit to previous Menu \n0 - to Quit");// Could have option to check AdminList
                                int inputNum2 = scanner.nextInt();

                                switch (inputNum2) {
                                    case 1: // Adding Product to Prod List.
                                        System.out.println(store.productList);
                                        Boolean addRemoveProdLoop = true;

                                        do {
                                            System.out.println("Would you like to \n 1-Add a Product  \n2-Remove a product \n0-Exit to Previous Menu?");
                                            inputNum = scanner.nextInt();
                                            if (inputNum == 1) {
                                                //admin.addProduct();
                                                System.out.println("Product Successfully Added!");
                                            } else if (inputNum == 2) {
                                               // admin.removeProduct();
                                                System.out.println("Product Successfully Removed!");
                                            } else if (inputNum == 0) {
                                                addRemoveProdLoop = false;
                                            } else {
                                                System.out.println("Entry invalid. Please enter ID and password again.");
                                            }
                                        } while (addRemoveProdLoop);

                                        break;
                                    case 2: // For Adding User to User List
                                        System.out.println("Print User LIst Here");
                                        //System.out.println(store.allUserList);
                                        System.out.println("User List under Construction.");
                                        break;
                                    case 8: // To Previous Menu
                                        selectProdUserListLoop = false;
                                        break;
                                    case 9: // To Main Menu
                                        selectProdUserListLoop = false;
                                        enterAdminLoop = false;
                                        break;
                                    case 0://To Quit
                                        selectProdUserListLoop = false;
                                        enterAdminLoop = false;
                                        selectUserLoop = false;
                                        break;

                                    default:
                                        System.out.println("Entry invalid. Please enter ID and password again.");
                                        break;
                                }
                            } while (selectProdUserListLoop);
                        } else if (inputString.equalsIgnoreCase("Exit")) {
                            enterAdminLoop = false;
                        } else {
                            System.out.println("invalid Input");
                        }
                    } while (enterAdminLoop);
                    break;
                case 0:
                    selectUserLoop = false;
                    break;
                default:
                    System.out.println("Invalid Input");
                    break;
            }
        } while (selectUserLoop) ;
        System.out.println("Thank you! Goodbye!");
    }
}
