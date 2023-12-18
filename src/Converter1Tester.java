import java.util.Scanner;
public class Converter1Tester {
    public static void main (String [] args) {
        final double MILE_TO_KM = 1.609;
        final double FEET_TO_CM = 30.5;
        final double INCHES_TO_CM = 2.54;
        Converter1 milesToMeters = new Converter1(1000*MILE_TO_KM);
        Converter1 feetToCm = new Converter1(FEET_TO_CM);
        Converter1 inchesToCm = new Converter1(INCHES_TO_CM);
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a Number to Convert:  ");
        double num = in.nextDouble();
        System.out.println(num + " Miles is " + milesToMeters.convertTo(num) + " in Meters");
        System.out.println(num + " Feet is " + feetToCm.convertTo(num) + " in Cm");
        System.out.print(num + " Inches is " + inchesToCm.convertTo(num) + " in Cm");
    }
}