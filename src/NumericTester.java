import java.util.Scanner;

public class NumericTester {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("x: ");
        double x = in.nextDouble();

        System.out.print("n: ");
        int n = in.nextInt();

        double p = Numeric.intPower(x, n);

        System.out.println("x ^ n: " + p);
    }
}
