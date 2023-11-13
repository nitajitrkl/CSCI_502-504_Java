import java.util.Scanner;
public class UnitConverterTester {
    public static void main(String [] args){
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Convert From:? ");
            String origin = input.next();
            System.out.print("Convert To:? ");
            String destination = input.next();
            System.out.print("Value: ");
            double amount = input.nextDouble();
            if (amount <= 0) return;
            UnitConverter machine = new UnitConverter(origin,destination,amount);
            System.out.println(amount + " " + origin + " = " + machine.convertTo() + " " + destination);
        }
    }
}