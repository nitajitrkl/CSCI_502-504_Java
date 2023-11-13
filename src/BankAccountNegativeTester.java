import java.util.Scanner;
public class BankAccountNegativeTester {
    public static void main(String [] args) {
        Scanner in = new Scanner(System.in);
        BankAccountNegative checking = new BankAccountNegative();
        System.out.print("Enter your Deposit: ");
        double deposit = in.nextDouble();
        checking.deposit(deposit);
        System.out.print("Enter your Withdraw: ");
        double withdraw = in.nextDouble();
        checking.withdraw(withdraw);
        System.out.println("Balance: $" + checking.getBalance());
    }
}