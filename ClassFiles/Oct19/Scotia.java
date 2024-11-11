package ClassFiles.Oct19;
/*
import java.util.Scanner;

public class Scotia  extends BankOfCanada{

    public double interestRate = 1.24;
    double balance = 0.0;
    Scanner scanner = new Scanner();



    @Override
    public double acceptDeposit() {
        System.out.println("Welcome to Scotia bank !");
        System.out.println("Enter the Deposit Amount below.");
        deposit = scanner.nextDouble();
    }
        @Override
        public double getBalance (){
            System.out.println("Your Balance after additional "+ interestRate +"% interest rate");
            balance = balance + (deposit * interestRate);
            return balance;
        }
    }
*/

// Scotia Bank extends BankOfCanada and overrides interest rate
class Scotia extends BankOfCanada {
    @Override
    public double getInterestRate() {
        return baseInterestRate + 1.24;  // Adding Scotia's rate to base rate
    }
}


