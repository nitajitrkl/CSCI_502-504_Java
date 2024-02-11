class Parent {
    final void finalMethod(){
        System.out.println("Message!!!");
    }
}
class Child extends Parent {
//    void finalMethod(){
//        System.out.println("Message Override!!!");
//    }
}

public class ParentTester {
    public static void main(String[] args) {
        Child sample = new Child();
        sample.finalMethod();
    }
}