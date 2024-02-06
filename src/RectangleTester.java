class Rectangle {
    Rectangle (double length, double width){
        this.length = length;
        this.width = width;
    }
    double calculateArea (){
        return length*width;
    }
    private double length;
    private double width;
}

class Cuboid extends Rectangle {
    Cuboid(double length, double width, double height) {
        super(length, width);
        this.length = length;
        this.width = width;
        this.height = height;
    }
    double calculateArea (){
        super.calculateArea();
        return 2 * (length + height + width);
    }
    private double length;
    private double width;
    private double height;
}

public class RectangleTester {
    public static void main(String[] args) {
        Rectangle r = new Rectangle(10,10);
        Cuboid c = new Cuboid(10, 10, 10);
        System.out.println(r.calculateArea());
        System.out.println(c.calculateArea());
    }
}