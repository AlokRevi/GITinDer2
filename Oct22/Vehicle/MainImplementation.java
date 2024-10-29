package Oct22.Vehicle;

public class MainImplementation extends Vehicle {

    public static void main(String[] args) {
        Car myCar = new Car();
        Bike myBike = new Bike();
        Vehicle vehicle = new Vehicle();

        myCar.displayInfo();

        System.out.println("....");

        myBike.displayInfo();

        System.out.println("....");

        vehicle.displayInfo();


        //this.print();
    }

    public void print() {



    }
}

