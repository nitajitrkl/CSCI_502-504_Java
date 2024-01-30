import java.util.Scanner;

public class FibonacciRecurseTester {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        FibonacciRecurse sample = new FibonacciRecurse();
        System.out.print("Enter a number: ");
        int count = in.nextInt();
        if (count > 0){
            sample.printFibonacci(0,1,count);
        }
        else System.out.println("No Negative numbers allowed or Zero!!!");
    }
}