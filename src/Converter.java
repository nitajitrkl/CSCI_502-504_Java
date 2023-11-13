public class Converter {
    public Converter (double aRate){
        rate = aRate;
    }
    public double getConvertedValue(double value) {
        return rate * value;
    }
    public final double rate;
}
