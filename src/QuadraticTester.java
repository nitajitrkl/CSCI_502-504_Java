import java.util.Scanner;
public class QuadraticTester {
    public static void main (String [] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Coefficient a: ");
        double A = input.nextDouble();
        System.out.print("Enter Coefficient b: ");
        double B = input.nextDouble();
        System.out.print("Enter Coefficient c: ");
        double C = input.nextDouble();
        Quadratic equation = new Quadratic(A, B, C);
        System.out.println("Root1: " + equation.getSolution1() + " & Root2 : " + equation.getSolution2());
    }
}
