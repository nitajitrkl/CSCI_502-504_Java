public class SavingsAccount {
    public SavingsAccount() {
        balance = 0;
        interestRate = 0;
    }
    public SavingsAccount(double initialBalance, double rate) {
        balance = initialBalance;
        interestRate = rate;
    }
    public void deposit(double amount) {
        balance += amount;
    }
    public void withdraw(double amount) {
        balance -= amount;
    }
    public double getBalance() {
        return balance;
    }
    public void addInterest() {
        balance += (balance * interestRate / 100);
    }
    private double balance;
    private final double interestRate;
}