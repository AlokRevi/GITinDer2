package ClassFiles.nov_30.D_Practice;

/*
1. Filter all even numbers from a list of integers.
2. Filter all odd numbers from a list of integers.
3. Square each number in a list of integers.
4. Remove all duplicate elements from a list of strings.
5. Count how many strings in a list have a length greater than 5.
6. Convert a list of strings to uppercase.
7. Find the first string in a list that starts with the letter "A".
8. Sort a list of integers in ascending order.
9. Sort a list of strings by length (shortest to longest).
10. Reverse a list of integers using streams.
*/

import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.toList;

public class A_OneToTen extends AllQuestions {

    @Override
    public void printQuestion(int problemNumber) {
        System.out.println("Problem no " + problemNumber + " : " + basicQuestions.get(problemNumber - 1));
    }

    @Override
    public void printResult(int problemNumber, Object outputContainer) {
        printResult(problemNumber, outputContainer);
    }

    public static void main(String[] args) {

        A_OneToTen child = new A_OneToTen();

        child.printQuestion(1);
        List<Integer> listInts = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        Predicate<Integer> p1 = (n) -> n % 2 == 0;

        List<Integer> oddList = new ArrayList<>();
        List<Integer> evenList = new ArrayList<>();

        for (Integer element : listInts) {
            if (p1.test(element)) {
                evenList.add(element);
            } else {
                oddList.add(element);
            }
        }

        System.out.println("Odd numbers :" + oddList);
        System.out.println("Even numbers :" + evenList);

        child.printQuestion(3);//Problem 3.

        // Square each number using Streams
        List<Integer> squaredNumbers = listInts.stream()
                .map(n -> n * n) // Square each number
                .collect(toList()); // Collect into a list

        // Print the result
        child.printResult(3, squaredNumbers);

        child.printQuestion(4);//Problem 4. Remove all duplicate elements from a list of strings.

        List<String> listStrings = Arrays.asList("A", "B", "C", "D", "A", "B", "B", "F", "A", "E", "D", "C");
        Set<String> nonDuplicate = listStrings.stream()
                .collect(Collectors.toSet());

        child.printResult(4, nonDuplicate);

        child.printQuestion(5); //5. Count how many strings in a list have a length greater than 5.

        List<String> listStrings2 = Arrays.asList("CDDAK", "lllADNBBF", "HdSFKAEDC", "ADNBBF", "HSFKAEDC", "ADNBBF", "HSFKAEDC");
        long count = listStrings2.stream()
                .filter(s -> s.length() > 5)
                .count();

        List<String> listOfStringsGreaterThan5 = listStrings2.stream()
                .filter(s -> s.length() > 5)
                .toList();

        List<Integer> listOfLengthsOfStringsMoreThan5 = listStrings2.stream()
                .filter(s -> s.length() > 5)
                .map(String::length)
                .toList();


        System.out.println("Problem 5 : " + count);
        System.out.println(listOfStringsGreaterThan5);
        System.out.println("list of lengths" + listOfLengthsOfStringsMoreThan5);


        child.printQuestion(6); //6. Convert a list of strings to lowercase.

        List<String> listOfStringsToLowerCase = listStrings2.stream()
                .map(String::toLowerCase) // n->n.lowercase()
                .toList();

        child.printResult(6, listOfStringsToLowerCase);

        child.printQuestion(7); // 7. Find the first string in a list that starts with the letter "A".

       /* String firstStringWithA = String.valueOf(listStrings2.stream()
              .filter(s->s.charAt(0)=='A')
              .findFirst());*/

        // Find the first string that starts with "A"
        String firstStringWithA = String.valueOf(listStrings2.stream()
                .filter(n -> n.startsWith("A"))
                .findFirst());
        // Print the result
        child.printResult(7, firstStringWithA);

/*
        // Print the result
        firstAName.ifPresentOrElse(
                name -> System.out.println("Problem 7 : First name starting with A: " + name),
                () -> System.out.println("No name starts with A")
    }*/


        child.printQuestion(8);//8. Sort a list of integers in ascending order.

        List<Integer> unsortedInts = Arrays.asList(11, 3552, 33, 54, 5, 336, 7, 58, 9, 510);


        List<Integer> sortedInts = unsortedInts.stream().
                sorted().
                toList();
        System.out.println("Problem 8 Solution -" + sortedInts);

        child.printQuestion(9);// 9 Sort a list of strings by length (shortest to longest).
        List<String> sortedStrings = listStrings2.stream().
                sorted(Comparator.comparingInt(String::length))
                .toList();

        child.printResult(9, sortedStrings);
        //10. Reverse a list of integers using streams.

        List<Integer> reverseList = unsortedInts.stream()
                .toList().reversed();

        child.printResult(10, reverseList);
    }


}