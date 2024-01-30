import java.util.Scanner;

public class concatAndUpperTester {
    public static void main(String[] args) {
        concatAndUpper sample = new concatAndUpper();
        Scanner in = new Scanner(System.in);
        System.out.println("Enter two strings");
        String a = in.next();
        String b = in.next();
        System.out.println("Result: " + sample.concatAndUpperCase(a,b));
    }
}
