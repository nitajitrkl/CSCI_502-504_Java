class Vehicle{
    void display(){
        System.out.println("This is a vehicle.");
    }
}

class Car1 extends Vehicle{
    void display (){
        System.out.println("This is a Car");
    }
}

public class VehicleTester {
    public static void main(String[] args) {
        Car1 sample = new Car1();
        sample.display();
    }
}