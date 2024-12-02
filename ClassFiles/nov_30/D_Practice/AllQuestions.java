package ClassFiles.nov_30.D_Practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AllQuestions {


    public static List<String> basicQuestions = new ArrayList<>(Arrays.asList(
            "Filter all even numbers from a list of integers.",
            "Filter all odd numbers from a list of integers.",
            "Square each number in a list of integers.",
            "Remove all duplicate elements from a list of strings.",
            "Count how many strings in a list have a length greater than 5.",
            "Convert a list of strings to uppercase.",
            "Find the first string in a list that starts with the letter \"A\".",
            "Sort a list of integers in ascending order.",
            "Sort a list of strings by length (shortest to longest).",
            "Reverse a list of integers using streams."
    ));

    public static List<String> intermediateQuestions = new ArrayList<>(Arrays.asList(
            "Group a list of strings by their length.",
            "Partition a list of integers into two groups: even and odd.",
            "Calculate the sum of all integers in a list.",
            "Find the maximum number in a list of integers.",
            "Find the minimum number in a list of integers.",
            "Concatenate all strings in a list into a single string with commas.",
            "Calculate the average of all integers in a list.",
            "Get a list of all unique characters from a list of strings.",
            "Group a list of people by their age group (e.g., below 20, 20-40, 40+).",
            "Find the longest string in a list of strings."
    ));


    public static List<String> advancedQuestions = new ArrayList<>(Arrays.asList(
            "Flatten a list of lists of integers into a single list.",
            "Calculate the frequency of each number in a list of integers.",
            "Merge two lists of integers into one and remove duplicates.",
            "Sort a list of objects by a specific field (e.g., sort a list of employees by salary).",
            "Check if all elements in a list of integers are positive numbers.",
            "Check if any string in a list starts with \"X\".",
            "Find the first element in a list that is divisible by both 3 and 5.",
            "Implement a method to remove strings from a list that are shorter than 4 characters.",
            "Create a map where the keys are the first letter of each string, and the values are lists of words starting with that letter.",
            "Implement a method that filters a list of integers to only include numbers that are prime."
    ));

    public static List<String> complexQuestions = new ArrayList<>(Arrays.asList(
            "Create a report that groups a list of orders by customer and calculates the total amount spent by each customer.",
            "Given a list of books, group them by their genre and sort each genre group by publication year.",
            "Process a list of transactions and calculate the total revenue per product category, excluding refunds.",
            "Create a list of students sorted by their average grade, grouped by their major.",
            "From a list of people, generate a summary that shows how many people fall into each age group (20-29, 30-39, etc.).",
            "Use streams to implement a \"combine and deduplicate\" function that merges two lists of items, keeping only unique elements.",
            "Convert a list of date strings into a map where the keys are the years and the values are lists of dates that belong to each year.",
            "Implement a method that checks if there are any repeated elements in a list of strings.",
            "Given a list of product prices, filter the list to get the prices that are greater than the average price.",
            "Combine multiple lists of integers into one list, then find the sum of the numbers divisible by both 2 and 3."
    ));

    public void printQuestion(int problemNumber, List<String> questionBatch) {
        System.out.println("Problem no " + problemNumber + " : " + questionBatch.get(problemNumber - 1));
    }

    public void printQuestion(int problemNumber) {
        System.out.println("Problem no " + problemNumber + " : ");
    }

    public void printResult(int problemNumber, Object outputContainer) {

        System.out.println("Output " + problemNumber + " -" + outputContainer);
        System.out.println();
        System.out.println("--------------------------------------------------");
    }

}