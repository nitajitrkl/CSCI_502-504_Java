import java.awt.Rectangle;
public class MoveTester {
    public static void main(String[] args) {
        Rectangle box = new Rectangle (5,10,20,30);
        box.translate (15,25);
        System.out.println("After Moving, the top left Corner is:");
        System.out.println(box.getX());
        System.out.println(box.getY());
    }
}
