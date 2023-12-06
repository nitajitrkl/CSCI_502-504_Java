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

        Purse a = new Purse();
        a.add("Quarter");
        a.add("Dime");

        Purse b = new Purse();
        b.add("Quarter");
        b.add("Dime");

        System.out.println(a.sameContents(b));

        Purse c = new Purse();
        c.add("Nickel");
        c.add("Dime");
        c.add("Nickel");

        Purse d = new Purse();
        d.add("Nickel");
        d.add("Dime");
        d.add("Quarter");

        System.out.println(c.sameContents(d));

    }
}
