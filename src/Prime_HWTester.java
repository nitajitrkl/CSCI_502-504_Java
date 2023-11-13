import java.util.Scanner;

public class Prime_HWTester {
    public static void main(String[] args) {
        Scanner in  = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = in.nextInt();
        int sum = 0;
        Prime_HW sample = new Prime_HW();
        boolean status = false;
        while (!status){
            int n = sample.nextPrime();
            if (n > num){
                status = true;
            }
            else {
                sum++;
                System.out.println(n);
            }
        }
        System.out.print("Number of Prime: " + sum);
    }
}
