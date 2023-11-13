import java.util.Scanner;
public class TriangularShapeConTester {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number: ");
        TriangularShapeCon shape = new TriangularShapeCon(in.nextInt());
        shape.printShape();
    }
}
