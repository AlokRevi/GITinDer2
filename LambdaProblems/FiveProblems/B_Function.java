package LambdaProblems.FiveProblems;

//Create a program that uses the Function functional interface to convert a list of String values to their respective lengths.
// For example, if the input list is ["apple", "banana", "cherry"], the output should be [5, 6, 6].

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class B_Function {

    public static void main(String[] args) {

        List<String> fruitsList = Arrays.asList("apple", "banana", "cherry");

        Function<String, Integer> findLength = (a) -> a.length();

        List<Integer> fruitLengths = new ArrayList<>();

        for (String element : fruitsList) {
            int j = findLength.apply(element);
            fruitLengths.add(j);
        }
    }
}



