import java.util.Scanner;
public class QuadraticNegativeTester {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Coefficient a: ");
        double A = input.nextDouble();
        System.out.print("Enter Coefficient b: ");
        double B = input.nextDouble();
        System.out.print("Enter Coefficient c: ");
        double C = input.nextDouble();
        QuadraticNegative equation = new QuadraticNegative(A, B, C);
        if (equation.hasSolution()) {
            System.out.println("Root1: " + equation.getSolution1() + " & Root2 : " + equation.getSolution2());
        }
        else
            System.out.println("There are No real roots");
    }
}