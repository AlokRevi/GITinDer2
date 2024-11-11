package ClassFiles.Vehicle;

/*
1.	Create a Vehicle class with the following:
○	A brand attribute (String).
○	A speed attribute (int).
○	A constructor to initialize the attributes.
○	A displayInfo() method that prints the brand and speed of the vehicle.
2.	Create a Car class that inherits from the Vehicle class. It should:
○	Add a doors attribute (int) that indicates the number of doors.
○	Override the displayInfo() method to include the number of doors.
3.	Create a Bike class that inherits from the Vehicle class. It should:
○	Add a type attribute (String) to specify if the bike is a "Sports Bike" or "Cruiser."
○	Override the displayInfo() method to include the bike's type.
Requirements:
●	Implement the classes Vehicle, Car, and Bike.
●	In the main() method, create instances of Car and Bike, and call their displayInfo() methods to demonstrate method overriding.

 */

//PARENT CLASS
public class Vehicle {
    String brand;
    int speed;

    public Vehicle() {
    }

    public Vehicle(String brand, int speed) {
        this.brand = brand;
        this.speed = speed;
    }

    public void displayInfo() {
        System.out.println("Car brand : " + brand);
        System.out.println("Top Speed : " + speed);
    }
}