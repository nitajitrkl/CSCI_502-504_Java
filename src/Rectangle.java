public class Rectangle {
    public Rectangle(double aLength, double aBreadth) {
        this.length = aLength;
        this.breadth = aBreadth;
    }
    public double calculateArea () {
        return length * breadth;
    }
    public double calculatePerimeter() {
        return 2 * (length + breadth);
    }
    private final double length;
    private final double breadth;
}