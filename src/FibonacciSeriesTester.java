import java.util.Scanner;
public class FibonacciSeriesTester {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        FibonacciSeries sample = new FibonacciSeries(in.nextInt());
        sample.printFibonacci();
    }
}