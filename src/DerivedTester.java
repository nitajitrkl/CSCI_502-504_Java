import p1.Base;

public class DerivedTester extends Base {
    public static void main(String[] args) {
        DerivedTester sample = new DerivedTester();
        sample.accessProtectedMethod();
    }
    public void accessProtectedMethod() {
        show();
    }
}