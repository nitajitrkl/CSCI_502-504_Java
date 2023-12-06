import java.util.Scanner;
public class CashRegisterInputTester {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        CashRegister customer = new CashRegister();
        System.out.print("Enter Price: ");
        double price = in.nextDouble();
        customer.recordPurchase(price);
        System.out.print("Enter Dollars: ");
        double paymentDollars = in.nextDouble();
        System.out.print("Enter Quarters: ");
        double paymentQuarters = in.nextDouble();
        System.out.print("Enter Dimes: ");
        double paymentDimes = in.nextDouble();
        System.out.print("Enter Nickels: ");
        double paymentNickels = in.nextDouble();
        System.out.print("Enter Pennies: ");
        double paymentPennies = in.nextDouble();
        customer.receivePayment(paymentDollars, paymentQuarters, paymentDimes, paymentNickels, paymentPennies);
//        System.out.println("Your Change: " + customer.giveChange());
    }
}