import java.util.Scanner;

public class CashRegisterCoinTester {
    public static void main(String[] args) {
        CashRegister sample = new CashRegister();
        Scanner in = new Scanner(System.in);

        final double NICKEL_VALUE = 0.05;
        final double DIME_VALUE = 0.1;
        final double QUARTER_VALUE = 0.25;
        final double PENNY_VALUE = 0.01;

        System.out.print("What is the Total Purchase AMOUNT?: ");
        sample.recordPurchase(in.nextDouble());
        System.out.println("How are you going to pay for it?");

        boolean done = false;
        while (!done) {
            System.out.println("Enter coin name or F to finish");
            String input = in.next();

            if (input.equalsIgnoreCase("F"))
                done = true;
            else {
                double value = switch (input) {
                    case "nickel" -> NICKEL_VALUE;
                    case "dime" -> DIME_VALUE;
                    case "quarter" -> QUARTER_VALUE;
                    case "penny" -> PENNY_VALUE;
                    default -> 0;
                };

                if (value != 0) {
                    System.out.println("Enter the number of coins");
                    int n = in.nextInt();
                    Coin c = new Coin(value, input);
                    sample.enterPayment(n, c);
                    System.out.println("Your change is " + sample.giveChange());
                }
            }
        }
    }
}