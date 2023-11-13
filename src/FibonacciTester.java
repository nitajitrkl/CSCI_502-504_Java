import java.util.Scanner;

public class FibonacciTester {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Fibonacci sample = new Fibonacci(in.nextInt());
        sample.printFibonacci();
    }
}
