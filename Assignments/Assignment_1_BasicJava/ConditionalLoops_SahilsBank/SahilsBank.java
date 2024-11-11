package Assignments.Assignment_1_BasicJava.ConditionalLoops_SahilsBank;

import java.util.Scanner;

public class SahilsBank {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);//created Scanner class object
        int choiceLv1 = 0;

        System.out.println("Welcome to the Sahil's Banking System!");

        double balanceAmount = 0.0;
        double withdrawalAmount = 0.0;
        double depositAmount = 0.0;

        int pinObj;
        int userPin;

        System.out.println("Set your 4 digit PIN.");
        pinObj = scanner.nextInt();
        userPin = pinObj;
        System.out.println("****************************************************************************");

        do {
            System.out.println("****************************************************************************");
            System.out.println("Confirm your 4 digit PIN to Enter Banking System Menu.");
            pinObj = scanner.nextInt();
            if (userPin == pinObj) {

                System.out.println("Please chose one of the following options:");
                System.out.println("1- Check Balance");
                System.out.println("2- Deposit Money");
                System.out.println("3- Withdraw Money");
                System.out.println("4- Exit");

                choiceLv1 = scanner.nextInt(); //declared and initialized Scanner object called choice.

                switch (choiceLv1) {
                    case (1):
                        System.out.println(" Account Balance is = " + balanceAmount + " CAD");
                        break;
                    case (2):
                        System.out.println("Please enter the amount to be deposited in your account : ");
                        depositAmount = scanner.nextDouble();
                        balanceAmount = balanceAmount + depositAmount;
                        System.out.println("Deposit Successful!");
                        break;
                    case (3):
                        System.out.println("Please enter the amount to be withdrawn from your account : ");
                        withdrawalAmount = scanner.nextDouble();
                        if (withdrawalAmount > balanceAmount) {
                            System.out.println("Insufficient Balance in the Account");
                            break;
                        } else if (withdrawalAmount <= balanceAmount) {
                            System.out.println("Withdrawal Successful!");
                            balanceAmount = balanceAmount - withdrawalAmount;
                            break;
                        } else {
                            System.out.println("Invalid Input. Please enter a numeric amount.");
                            break;
                        }

                    case (4):
                        System.out.println("Thank you for Banking at Sahil's Banking System.");
                        break;
                    default:
                        System.out.println("Invalid input. Please enter again.");
                        break;
                }
                if ((choiceLv1 != 1) && (choiceLv1 != 4))
                    System.out.println(" Current Account Balance is = " + balanceAmount + " CAD");
            } else {
                System.out.println("Invalid PIN. Please try again.");
            }
        } while (choiceLv1 != 4);
    }
}

