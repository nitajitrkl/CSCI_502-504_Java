class Car3 implements Drivable {
    @Override
    public void startEngine() {
        System.out.println("Engine started!!!");
    }

    @Override
    public void stopEngine() {
        System.out.println("Engine Stopped!!!");
    }

}
public class Car3Tester {
    public static void main(String[] args) {
        Car3 sample = new Car3();
        sample.startEngine();
        sample.stopEngine();
    }
}
