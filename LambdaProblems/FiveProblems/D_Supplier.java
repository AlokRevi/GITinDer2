package LambdaProblems.FiveProblems;

//Implement a Supplier that generates random integers between 1 and 100. Write a program to print 5 random integers using this Supplier.

import java.util.Random;
import java.util.function.Supplier;

public class D_Supplier {

    public static void main(String[] args) {

// Supplier only has a return type and no parameters
        Supplier<Integer> randomIntSupplier = () -> {

            Random random = new Random();
            int j = random.nextInt(100) + 1;
            return j;
        };

        System.out.println();

        for (int i = 0; i < 5; i++) {
            randomIntSupplier.get();
        }
    }

}
