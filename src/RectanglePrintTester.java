import java.util.Scanner;

public class RectanglePrintTester {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a Height: ");
        int height = in.nextInt();
        System.out.print("Enter a Width: ");
        int width = in.nextInt();
        System.out.print("Enter a character: ");
        char ch = in.next().charAt(0);
        RectanglePrint.PrintRectangle(height, width, ch);
    }
}
