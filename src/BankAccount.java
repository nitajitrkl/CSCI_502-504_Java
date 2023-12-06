public class BankAccount {
//    public BankAccount (int anAccountNumber) {
//        accountNumber = anAccountNumber;
//        balance = 0;
//    }
    public BankAccount (int anAccountNumber, double initialBalance) {
        accountNumber = anAccountNumber;
        balance = initialBalance;
    }
    public void deposit (double amount){
        balance += amount;
    }
    public void withdraw (double amount) {
        balance -= amount;
    }
    public double getBalance () {
        return balance;
    }
    private double balance;
    private int accountNumber;
}
