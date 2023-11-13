import java.util.Scanner;

public class TriangularShapeTester {
    public static void main(String[] args) {
        System.out.print("Enter a number: ");
        Scanner in = new Scanner(System.in);
        TriangularShape shape = new TriangularShape(in.nextInt());
        shape.printTriangle();
    }
}
