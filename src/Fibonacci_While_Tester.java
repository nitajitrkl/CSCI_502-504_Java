import java.util.Scanner;

public class Fibonacci_While_Tester {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = in.nextInt();
        Fibonacci_While sample = new Fibonacci_While(num);
        sample.printFibonacci();
    }
}