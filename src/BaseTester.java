class Derived1 extends Base1 {
    void show (){
        System.out.println("Devrived!!!");
    }
}

public class BaseTester {
    public static void main(String[] args) {
        Base1 b = new Base1();
        Derived1 d = new Derived1();
        b.show();
        d.show();
    }
}