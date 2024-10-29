package Oct22.Vehicle;

public class Car extends Vehicle {
    String brand = "Toyota";
    int speed = 130;
    int doors = 4;

    //default constructor
    public Car(){
    }

    //constructor - string int
    public Car(String brand, int speed){
       this.brand=brand;
       this.speed=speed;
    }

    //method to print
    @Override
    public void displayInfo() {
        System.out.println("Car brand : " + this.brand );
        System.out.println("Top Speed : " + this.speed );
        System.out.println("No of doors is " + this.doors);

    }

}
