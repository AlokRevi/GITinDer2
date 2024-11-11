//Create a Bank of Canada class which has a rate of interest of 5.5 .
//Extend other bank classess called  scotia , bmo rbc and Pragra  with rates. 1.24%, 1.55%, 2.10% and none.
// Pragra bank has no interest.
// experiment with creating objects of all bank classes and calculating interest rates.
//read about the benefits of inheritance, including code reusability and extensibility.
//Open-Closed Principle from SOLID principles.
//Different types of inheritance: single, multi-level, hierarchical, and multiple.

/*
import java.util.Scanner;

public class BankOfCanada {
    Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
    }

    public double interestRate = 5.5;
    double balance = 0.0;
    double deposit;

    public double acceptDeposit() {
        System.out.println("Enter the Deposit Amount below.");
        deposit = scanner.nextDouble();
    }


        public double getBalance(){
            balance = balance + (deposit * interestRate);
            return balance;
        }
    }
*/
package ClassFiles.Oct19;

public class BankOfCanada {
    // Bank of Canada base interest rate
    double baseInterestRate = 5.5;

    // Method to return the interest rate
    public double getInterestRate() {
        return baseInterestRate;
    }
}





