public class BankAccountArrayList {
    public BankAccountArrayList(int anAccountNumber){
        accountNumber = anAccountNumber;
        balance = 0;
    }
    public BankAccountArrayList(int anAccountNumber, double initialBalance){
        accountNumber = anAccountNumber;
        balance = initialBalance;
    }
    public void deposit (double amount){
        balance = balance + amount;
    }
    public void withdraw (double amount){
        balance = balance - amount;
    }
    public int getAccountNumber (){
        return accountNumber;
    }
    public double getBalance (){
        return balance;
    }
    private final int accountNumber;
    private double balance;
}
