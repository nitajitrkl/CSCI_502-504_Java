interface Swimmable {
    default void swim() {
        System.out.println("Swimming...");
    }
}
interface Diveable {
    default void dive() {
        System.out.println("Diving...");
    }
}
class Frog implements Swimmable, Diveable {
    public void swim() {
        System.out.println("Frog is swimming");
    }
    public void dive() {
        System.out.println("Frog is diving");
    }
}
public class FrogTester {
    public static void main(String[] args) {
        Frog sample = new Frog();
        sample.dive();
        sample.swim();
    }
}
