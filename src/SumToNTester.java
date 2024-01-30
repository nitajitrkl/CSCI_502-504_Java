import java.util.Scanner;

public class SumToNTester {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        SumToN sample = new SumToN();
        System.out.print("Enter a number: ");
        int n = in.nextInt();
        System.out.println("Sum upto n:  " + sample.sumUpToN(n));
    }
}
