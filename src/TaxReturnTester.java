import java.util.Scanner;
public class TaxReturnTester {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter your income: ");
        double income = input.nextDouble();
        System.out.println("Please enter S for single, " + "M for married: ");
        String status = input.next();
        TaxReturn aTaxReturn = new TaxReturn(income, status);
        System.out.println("The tax is " + aTaxReturn.getTax());
    }
}
