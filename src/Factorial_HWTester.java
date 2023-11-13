import java.util.Scanner;

public class Factorial_HWTester {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number for Factorial: ");
        int number = in.nextInt();
        if (number < 0){
            System.out.println("No factorial for Negative inputs");
        } else {
            Factorial_HW sample = new Factorial_HW(number);
            System.out.println("Factorial is: " + sample.getFactorial());
        }

    }
}
