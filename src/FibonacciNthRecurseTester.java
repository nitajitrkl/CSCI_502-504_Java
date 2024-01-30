import java.util.Scanner;

public class FibonacciNthRecurseTester {
    public static void main(String[] args) {
        FibonacciNthRecurse sample = new FibonacciNthRecurse();
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int count = in.nextInt();
        System.out.println("Nth Fibonacci: "+ sample.Recusrse(count-1));
    }
}
