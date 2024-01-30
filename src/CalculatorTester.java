import java.util.Scanner;

public class CalculatorTester {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter 2 Numbers: ");
        Calculator sample = new Calculator(in.nextInt(), in.nextInt());
        System.out.println("Addition: "+ sample.add());
        System.out.println("Subtraction: "+ sample.subtract());
        System.out.println("Multiplication: "+ sample.multiply());
        System.out.println("Division: "+ sample.divide());
    }
}
