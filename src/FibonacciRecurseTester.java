import java.util.Scanner;

public class FibonacciRecurseTester {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        FibonacciRecurse sample = new FibonacciRecurse();
        System.out.print("Enter a number: ");
        int count = in.nextInt();
        sample.printFibonacci(0,1,count);
    }
}