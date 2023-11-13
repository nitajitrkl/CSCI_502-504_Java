import java.util.Scanner;
public class Prime_HW_Input_Tester {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = in.nextInt();
        Prime_HW_Input sample = new Prime_HW_Input(number);
        if (sample.isPrime()){
            System.out.println(number + " is a Prime.");
        } else System.out.println(number + " is not a Prime.");
    }
}