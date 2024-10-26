package Oct19;
/*
import java.util.Scanner;

public class PragraBank extends BankOfCanada {
    public static void main(String[] args) {

        double balance = 0.0;
        Scanner scanner = new Scanner();
        double deposit;
        
        System.out.println("Welcome to Pragra bank !");

        BankOfCanada bankOfCanada = new BankOfCanada();
        BankOfCanada BankOfCanada;
        BankOfCanada.acceptDeposit(){
            System.out.println("Enter the Deposit Amount below.");
            deposit = scanner.nextDouble();
        }

        public double getBalance (){
                System.out.println("Your Balance with no additional interest rate");
                balance = balance + deposit;
                return balance;
            }
    }
}
*/

// Pragra extends BankOfCanada but does not override the interest rate method
class Pragra extends BankOfCanada {
    // No override here, Pragra uses the base rate from BankOfCanada
}
