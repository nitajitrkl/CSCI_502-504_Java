import java.util.ArrayList ;
public class Bank {
    public Bank() {
        accounts = new ArrayList<BankAccount>() ;
    }
    public void addAccount(BankAccount a) {
        accounts.add(a) ;
    }
    public double getTotalBalance() {
        double total = 0;
        for (BankAccount current : accounts) {
            total = total + current.getBalance();
        }
        return total ;
    }
    public int count(double atLeast) {
        int matches = 0 ;
        for (BankAccount current : accounts) {
            if (current.getBalance() >= atLeast)
                matches++;
        }
        return matches ;
    }
    public BankAccount find(int accountNumber) {
        for (BankAccount a : accounts) {
            if (a.getAccountNumber() == accountNumber)
                return a;
        }
        return null ;
    }
    public BankAccount getMaximum() {
        if (accounts.isEmpty())
            return null;
        BankAccount largestYet = accounts.get(0) ;
        for ( int i = 1; i < accounts.size(); i++ ) {
            BankAccount current = accounts.get(i) ;
            if (current.getBalance() > largestYet.getBalance())
                largestYet = current ;
        }
        return largestYet ;
    }
    public void addCount(int accountNumber, double initialBalance){
        accounts.add(new BankAccount(accountNumber, initialBalance));
    }
    public void deposit(int accountNumber, double amount){
        find(accountNumber).deposit(amount);
    }
    public void withdraw(int accountNumber, double amount){
        find(accountNumber).withdraw(amount);
    }
    public double getBalance(int accountNumber){
        return find(accountNumber).getBalance();
    }
    private final ArrayList<BankAccount> accounts ;
}