public class SodaCan {
    public SodaCan (double h, double r) {
        height = h;
        radius = r;
    }
    public double getSurfaceArea ()
    {
        return 2 * Math.PI * (radius * radius + radius * height);
    }
    public double getVolume ()
    {
        return Math.PI * radius * radius * height;
    }
    private final double height;
    private final double radius;
}
