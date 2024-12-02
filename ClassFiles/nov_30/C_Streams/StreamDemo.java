/*
package ClassFiles.nov_30.C_Streams;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamDemo {


    public static void main(String[] args) {

        List<String> names = Arrays.asList("Antwerp", "Bushwack", "Corinth", "Diggstown");

        //Stream stream=names.stream(); // stream of strings because stream is created from a string List.
        names.stream().filter(s -> s.length() < 7).forEach(System.out::println);

        names.stream().filter(StreamDemo::filterCities).map(StreamDemo::capitalizeFirstLetter).forEach(System.out::println);


        //Predicate
        List<String> dishes = new ArrayList<>();

        dishes.add(
                Dish.builder().name("Hamburger")
                        .price(12.5).calories(800)
                        .dishType()
                        .dishType()
                        .ingredients(List.of("Ham", "Cheese", "Tomato", "Onion","Bun").build())

        );

    }

    public static boolean filterCities(String s) {
        return s.length() < 8;
    }

    public static String capitalizeFirstLetter(String s) {
        return s.substring(0, 1).toUpperCase() + s.substring(1);
    }
}
*/
