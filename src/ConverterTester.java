import java.util.Scanner;
public class ConverterTester {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the Exchange rate between USD to Euro: ");
        double rate = in.nextDouble();
        Converter sample = new Converter(rate);
        boolean status = false;
        while (!status){
            System.out.print("Enter the amount to be converted: or 'Q' to quit: ");
            String value = in.next();
            if (value.equalsIgnoreCase("Q")) {
                status = true;
                System.out.println("Program Closed");
            }
            else {
                double amount = Double.parseDouble(value);
                if (amount >= 0){
                    System.out.println("The Converted value is: " + sample.getConvertedValue(amount));
                }
                else {
                    status = true;
                    System.out.println("No Negative amount input allowed");
                }
            }
        }
    }
}