import java.util.Scanner;
public class Fibonacci_NthNumberTester {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = in.nextInt();
        Fibonacci_NthNumber sample = new Fibonacci_NthNumber();
        int next = 0;
        if (num > 0 && num<=2){
            next = 1;
        } else{
            for (int i =3; i<=num; i++){
                next = sample.nextNumber();
            }
        }
        System.out.print(next);
    }
}
