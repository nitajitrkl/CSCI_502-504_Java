import java.awt.geom.Point2D;
import java.awt.geom.Line2D;
import java.awt.Graphics2D;
import java.util.ArrayList;

public class Polygon
{
    public Polygon() {
        points = new ArrayList<Point2D.Double>();
    }
    public void add(Point2D.Double aPoint) {
        points.add(aPoint);
    }
    public void draw(Graphics2D g2) {
        for (int i = 0; i < points.size(); i++) {
            Point2D.Double from = points.get(i);
            Point2D.Double to = points.get((i + 1) % points.size());
            g2.draw(new Line2D.Double(from, to));
        }
    }
    public double perimeter() {
        double p = 0;
        int i;
        for (i = 0; i < points.size(); i++) {
            Point2D.Double from = points.get(i);
            Point2D.Double to = points.get((i + 1) % points.size());
            p = p + distance(from, to);
        }
        return p;
    }
    public static double distance(Point2D.Double p, Point2D.Double q) {
        double dx = p.getX() - q.getX();
        double dy = p.getY() - q.getY();
        return Math.sqrt(dx * dx + dy * dy);
    }
    public double area() {
        double a = 0;
        for (int i = 0; i < points.size(); i++) {
            Point2D.Double from = points.get(i);
            Point2D.Double to = points.get((i + 1) % points.size());
            a = a + from.getX() * to.getY() - from.getY() * to.getX();
        }
        return 0.5 * Math.abs(a);
    }

    private ArrayList<Point2D.Double> points;
}
