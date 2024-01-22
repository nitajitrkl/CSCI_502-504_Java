import java.util.Scanner;

public class RectanglePrintTester {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a Height: ");
        int height = in.nextInt();
        System.out.println("Enter a Width");
        int width = in.nextInt();
        System.out.println("Enter a character");
        String ch = in.next();
        RectanglePrint.PrintRectangle(height, width, ch);
    }
}
