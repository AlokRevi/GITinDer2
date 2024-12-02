package LambdaProblems.FiveProblems;
//Write a program that uses the Predicate interface to filter a list of integers based on multiple conditions.
//For example, remove all integers that are: Less than 10. Greater than 30. Odd numbers. Print the resulting list.

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class F_Predicate {

    public static void main(String[] args) {


    /*    List<Integer> nums = new ArrayList<>();

        nums.add(11);
        nums.add(22);
        nums.add(31);
        nums.add(42);
        nums.add(59);
        nums.add(62);
        nums.add(71);
        nums.add(82);
        nums.add(95);*/

        // List of integers
        List<Integer> numbers = Arrays.asList(5, 10, 15, 20, 25, 30, 35, 40, 50);

        // Define the Predicate for filtering
        Predicate<Integer> lessThan10 = n -> n < 10;     // Less than 10
        Predicate<Integer> greaterThan30 = n -> n > 30; // Greater than 30
        Predicate<Integer> isOdd = n -> n % 2 != 0;     // Odd numbers

        // Combine the predicates using OR
        Predicate<Integer> filterConditions = lessThan10.or(greaterThan30).or(isOdd);

        // Filter the list
        List<Integer> filteredNumbers = new ArrayList<>();
        for (Integer number : numbers) {
            if (!filterConditions.test(number)) { // Keep numbers not matching the conditions
                filteredNumbers.add(number);
            }
        }

        // Print the resulting list
        System.out.println("Original List: " + numbers);
        System.out.println("Filtered List: " + filteredNumbers);


        }
}