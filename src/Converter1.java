public class Converter1 {
    public Converter1 (double aConversionFactor)
    {
        factor = aConversionFactor;
    }
    public double convertTo (double fromMeasurement)
    {
        return factor * fromMeasurement;
    }
    final double MILE_TO_KM = 1.609;
    private final double factor;
}
