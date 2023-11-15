import java.util.Scanner;
public class EarthquakeTester {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        double mag= input.nextDouble();
        Earthquake abc = new Earthquake(mag);
        System.out.println(abc.getDescription());
    }
}