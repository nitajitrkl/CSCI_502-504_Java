public class TemperatureTester {
    public static void main(String[] args) {
        Temperature sample = new Temperature(15.4);
        System.out.println("Celsius: 15.4");
        System.out.println("Fahrenheit: "+ sample.toFahrenheit());
    }
}
