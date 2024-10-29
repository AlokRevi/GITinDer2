package Oct22.Vehicle;

public class Bike extends Vehicle {
    String brand = "Yamaha";
    int speed = 160;
    String type = "cruiser";

    //default constructor
    public Bike() {
    }

    // Constructor - String
    public Bike(String type) {
        this.type = type;
    }


   /* //constructor - string int
    public Bike (String brand , int speed){

    }

    */

    @Override
    public void displayInfo() {
        System.out.println("Bike brand : " + this.brand);
        System.out.println("Top Speed : " + this.speed);
        System.out.println("Bike type : " + this.type);
    }
}
