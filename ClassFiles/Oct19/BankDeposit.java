package ClassFiles.Oct19;

public class BankDeposit {

    public static void main(String[] args) {

        // Create objects of each bank class
        BankOfCanada canada = new BankOfCanada();
      Scotia scotia = new Scotia();
        BMO bmo = new BMO();
        RBC rbc = new RBC();
        Pragra pragra = new Pragra();

        // Print the interest rates for each bank
        System.out.println("Bank of Canada Interest Rate: " + canada.getInterestRate() + "%");
        System.out.println("Scotia Bank Interest Rate: " + scotia.getInterestRate() + "%");
        System.out.println("BMO Bank Interest Rate: " + bmo.getInterestRate() + "%");
        System.out.println("RBC Bank Interest Rate: " + rbc.getInterestRate() + "%");
        System.out.println("Pragra Bank Interest Rate (inherits base rate): " + pragra.getInterestRate() + "%");
    }
}
