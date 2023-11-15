public class Converter1 {
    public Converter1 (double aConversionFactor)
    {
        factor = aConversionFactor;
    }
    public double convertTo (double fromMeasurement)
    {
        return factor * fromMeasurement;
    }
    private final double factor;
}