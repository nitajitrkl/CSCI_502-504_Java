public abstract class Vehicle2 {
    public void start(){
    }
    public void stop(){
    }
    public abstract void refuel();

    public static void main(String[] args) {
        Car2 sampleCar = new Car2();
        sampleCar.refuel();
        Truck2 sampleTruck = new Truck2();
        sampleTruck.refuel();
    }
}

class Car2 extends Vehicle2 {
    public void refuel (){
        System.out.println("Petrol!!!");
    }
}

class Truck2 extends Vehicle2 {
    public void refuel (){
        System.out.println("Diesel!!!");
    }
}

