package ClassFiles.nov_30.C_Streams;

import lombok.Data;
import lombok.Builder;

import java.util.List;

@Data
@Builder
public class Dish {

    private final String name;
    private final int calories;
    private final double price;
    private final List<String> ingredients;
    private final DishType dishType;

}

