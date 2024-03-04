interface Flyable {
    void fly();
}
interface Floatble {
    void floatOnWater();
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
class Seaplane implements Floatble, Flyable {

    @Override
    public void fly() {
        System.out.println("Seaplanes can fly!!!");
    }

    @Override
    public void floatOnWater() {
        System.out.println("Seaplanes can float on water too!!!");
    }
}
public class FlyableTester {
    public static void main(String[] args) {
        Flyable bird = new Bird();
        Flyable airplane = new Airplane();
        bird.fly();
        airplane.fly();
        Seaplane seaplane = new Seaplane();
        seaplane.fly();
        seaplane.floatOnWater();
    }
}