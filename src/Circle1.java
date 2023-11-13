public class Circle1 {
    public Circle1(double r) {
        radius = r;
    }
    public double getArea() {
        return 3.141 * radius * radius;
    }
    public double getPerimeter() {
        return 2 * 3.14 * radius;
    }
    private final double radius;
}
