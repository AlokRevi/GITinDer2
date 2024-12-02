package LambdaProblems.FiveProblems;
//Write a program that uses the Predicate functional interface to filter a list of integers.
//Remove all integers greater than 50 from the list and print the resulting list.

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class A_Predicate {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>();

        nums.add(12);
        nums.add(22);
        nums.add(32);
        nums.add(42);
        nums.add(52);
        nums.add(62);
        nums.add(72);
        nums.add(82);
        nums.add(92);

        Predicate <Integer> fiftyPlus= n-> n<=50;
        nums.removeIf(fiftyPlus);
        System.out.println(nums);
        }
    }


