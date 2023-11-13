public class BankAccountNegative {
    public BankAccountNegative () {
        balance = 0;
    }
    public BankAccountNegative (double initialBalance) {
        if (initialBalance >= 0)
            balance = initialBalance;
        else
            System.out.println("Initial Balance cant be Negative");
    }
    public void deposit (double amount) {
        if (amount >= 0)
            balance += amount;
        else
            System.out.println("Deposit can't be Negative");
    }
    public void withdraw (double amount) {
        if (amount >=0) {
            if (amount <= balance)
                balance -= amount;
            else
                System.out.println("No sufficient Balance");
        }
        else
            System.out.println("Withdraw can't be Negative");
    }
    public double getBalance () {
        return balance;
    }
    private double balance;
}