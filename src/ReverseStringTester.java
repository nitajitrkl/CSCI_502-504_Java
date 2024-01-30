import java.util.Scanner;

public class ReverseStringTester {
    public static void main(String[] args) {
        ReverseString sample = new ReverseString();
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a String:");
        System.out.print("Reverse String:  " + sample.Reverse(in.next()));
    }
}
