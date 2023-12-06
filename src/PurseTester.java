public class PurseTester {
    public static void main(String[] args) {
        Purse sample = new Purse();
        sample.add("Quarter");
        sample.add("Dime");
        sample.add("Nickel");
        sample.add("Dime");
        System.out.println("Original purse: " + sample.toStrng());
        sample.reverse();
        System.out.println("Reversed purse: " + sample.toStrng());
    }
}
