public class SodaCanTester {
    public static void main(String[] args) {
        SodaCan can = new SodaCan(4, 1);
        System.out.print("The SodaCan just constructed has a total surface area " + can.getSurfaceArea());
        System.out.print(", and a volume " + can.getVolume());
    }
}
