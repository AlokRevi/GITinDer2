package ClassFiles.Oct19;
/*
import java.util.Scanner;

public class BMO  extends BankOfCanada{

    public double interestRate = 1.55;
    double balance = 0.0;
    Scanner scanner = new Scanner();

    @Override
    public double acceptDeposit() {
        System.out.println("Welcome to BMO bank !");
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


// BMO extends BankOfCanada and overrides interest rate
class BMO extends BankOfCanada {
    @Override
    public double getInterestRate() {
        return baseInterestRate + 1.55;  // Adding BMO's rate to base rate
    }
}