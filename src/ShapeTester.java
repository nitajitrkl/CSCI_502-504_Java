import java.util.ArrayList;

abstract class Shape{
    public void draw(){
        System.out.println("Shape has been drawn!!!");
    }
}

class Circle extends Shape {
    public void draw(){
        System.out.println("Circle has been drawn!!!");
    }
}

class Rectangle1 extends Shape {
    public void draw(){
        System.out.println("Rectangle has been drawn!!!");
    }
}

class Triangle extends Shape {
    public void draw(){
        System.out.println("Triangle has been drawn!!!");
    }
}

public class ShapeTester {
    public static void main(String[] args) {
        Shape c = new Circle();
        Shape r = new Rectangle1();
        Shape t = new Triangle();
        ArrayList<Shape> shapes = new ArrayList<>();
        shapes.add(c);
        shapes.add(r);
        shapes.add(t);
        for (Shape shape : shapes){
            shape.draw();
        }
    }
}