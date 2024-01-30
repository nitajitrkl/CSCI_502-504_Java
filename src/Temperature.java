public class Temperature {
    public Temperature(double aCelsius){
        celsius = aCelsius;
    }
    public double toFahrenheit(){
        return ((celsius*9)/5)+32;
    }
    private final double celsius;
}
