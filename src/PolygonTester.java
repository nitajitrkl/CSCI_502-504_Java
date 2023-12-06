import java.awt.geom.Point2D;

public class PolygonTester {
    public static void main(String[] args) {
        Polygon square = new Polygon();

        square.add(new Point2D.Double(100, 100));
        square.add(new Point2D.Double(100, 150));
        square.add(new Point2D.Double(150, 150));
        square.add(new Point2D.Double(150, 100));

        Polygon pentagon = new Polygon();

        pentagon.add(new Point2D.Double(150, 150));
        pentagon.add(new Point2D.Double(175, 200));
        pentagon.add(new Point2D.Double(225, 200));
        pentagon.add(new Point2D.Double(250, 150));
        pentagon.add(new Point2D.Double(200, 100));

        double squarePerimiter = square.perimeter();
        System.out.println("Square perimeter = " + squarePerimiter);

        double squareArea = square.area();
        System.out.println("Square area = " + squareArea);

        double pentagonPerimiter = pentagon.perimeter();
        System.out.println("Pentagon perimeter = " + pentagonPerimiter);

        double pentagonArea = pentagon.area();
        System.out.println("Pentagon area = " + pentagonArea);

    }
}
