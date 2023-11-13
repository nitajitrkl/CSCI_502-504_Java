import java.util.Scanner;
public class InputCheckerTester {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a Message: ");
        String message = in.next();
        InputChecker m1 = new InputChecker(message);
        System.out.println(m1.getMessage());
    }
}