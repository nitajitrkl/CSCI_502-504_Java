public class Quadratic {
    public Quadratic(double A, double B, double C) {
        a = A;
        b = B;
        c = C;
    }
    public double getSolution1 () {
        return (-b + (Math.sqrt((b*b)-(4*a*c)))) / (2 * a);
    }
    public double getSolution2 () {
        return (-b - (Math.sqrt((b*b)-(4*a*c)))) / (2 * a);
    }
    private final double a;
    private final double b;
    private final double c;
}