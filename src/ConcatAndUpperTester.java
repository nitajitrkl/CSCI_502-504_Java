import java.util.Scanner;

public class ConcatAndUpperTester {
    public static void main(String[] args) {
        ConcatAndUpper sample = new ConcatAndUpper();
        Scanner in = new Scanner(System.in);
        System.out.println("Enter two strings");
        String a = in.next();
        String b = in.next();
        System.out.println("Result: " + sample.concatAndUpperCase(a,b));
    }
}
