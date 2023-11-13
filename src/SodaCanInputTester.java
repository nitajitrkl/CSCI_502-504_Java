import java.util.Scanner;
public class SodaCanInputTester {
    public static void main (String [] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a Diameter of the Soda can: ");
        double diameter = in.nextDouble();
        System.out.println("Enter a Height of the Soda can: ");
        double height = in.nextDouble();
        SodaCan can = new SodaCan(height, diameter / 2);
        System.out.println("Surface Area of the can is : " + can.getSurfaceArea());
        System.out.println("Volume of the can is : " + can.getVolume());
    }
}
