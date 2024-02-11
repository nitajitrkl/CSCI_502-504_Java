interface Flyable {
    void fly();
}
class Bird implements Flyable {
    public void fly() {
        System.out.println("Birds are flying!!!");
    }
}
class Airplane implements Flyable {
    public void fly() {
        System.out.println("Airplanes are flying!!!");
    }
}
public class FlyableTester {
    public static void main(String[] args) {
        Flyable bird = new Bird();
        Flyable airplane = new Airplane();
        bird.fly();
        airplane.fly();
    }
}