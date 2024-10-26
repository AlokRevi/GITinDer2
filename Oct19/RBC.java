package Oct19;
/*
public class RBC  extends BankOfCanada{

    public double interestRate = 2.1;
    double balance = 0.0;

    @Override
    public double acceptDeposit() {
        System.out.println("Welcome to RBC  bank !");
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



// RBC extends BankOfCanada and overrides interest rate
class RBC extends BankOfCanada {
    @Override
    public double getInterestRate() {
        return baseInterestRate + 2.10;  // Adding RBC's rate to base rate
    }
}