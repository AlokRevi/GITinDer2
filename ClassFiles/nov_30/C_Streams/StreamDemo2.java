/*
package ClassFiles.nov_30.C_Streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamDemo2 {

    public static void main(String[] args) {
        List<Dish> dishes = createDishes();

        List<String> cheapDishes = dishes.stream().filter(d -> d.getPrice() < 10)
                .map(Dish::getName).distinct().collect(Collectors.toList());
        System.out.println(cheapDishes);

        List<Dish> dishes = new ArrayList<>();

        dishes.add(Dish.builder().name("Hamburger")
                .price(12.5).calories(800)
                .dishType(DishType.NON_VEG)
                .ingredients(List.of("Ham", "Cheese", "Tomoto", "Bun")).build());
        dishes.add(Dish.builder().name("Samosa")
                .price(0.75).calories(300)
                .dishType(DishType.VEG)
                .ingredients(List.of("Potato", "Peas", "Salt", "Chilli")).build());
        dishes.add(Dish.builder().name("Sandwitch")
                .price(6.5).calories(400)
                .dishType(DishType.VEG)
                .ingredients(List.of("Bread", "Cheese", "Salt", "Chilli", "Ketchup")).build());
        dishes.add(Dish.builder().name("Butter Chicken")
                .price(6.5).calories(400)
                .dishType(DishType.VEG)
                .ingredients(List.of("Chicken", "Butter", "Salt", "Chilli", "Tomoto")).build());
        dishes.add(Dish.builder().name("Butter Chicken")
                .price(6.5).calories(400)
                .dishType(DishType.VEGAN)
                .ingredients(List.of("Chicken", "Butter", "Salt", "Chilli", "Tomoto")).build());

    }

    private List<Dish> createDishes() {
    }
}
*/
