class Shape{
    double calculateArea (){
        return 0;
    }
}

class Circle extends Shape {
    private final double radius;
    public Circle(double radius) {
        this.radius = radius;
    }
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}

class Square extends Shape {
    private final double side;
    public Square(double side) {
        this.side = side;
    }
    public double calculateArea() {
        return side * side;
    }
}

public class ShapeTester {
    public static void main(String[] args) {
        Circle c = new Circle(1);
        Square s = new Square(1);
        System.out.println(c.calculateArea());
        System.out.println(s.calculateArea());
    }
}