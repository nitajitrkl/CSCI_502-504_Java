import java.util.ArrayList ;
public class Bank
{
    public Bank()
    {
        accounts = new ArrayList<BankAccountArrayList>() ;
    }
    public void addAccount(BankAccountArrayList a)
    {
        accounts.add(a) ;
    }
    public double getTotalBalance()
    {
        double total = 0;
        for (BankAccountArrayList current : accounts) {
            total = total + current.getBalance();
        }
        return total ;
    }
    public int count(double atLeast)
    {
        int matches = 0 ;
        for (BankAccountArrayList current : accounts) {
            if (current.getBalance() >= atLeast)
                matches++;
        }
        return matches ;
    }
    public BankAccountArrayList find(int accountNumber)
    {
        for (BankAccountArrayList a : accounts) {
            if (a.getAccountNumber() == accountNumber)
                return a;
        }
        return null ;
    }
    public BankAccountArrayList getMaximum()
    {
        if (accounts.isEmpty())
            return null;
        BankAccountArrayList largestYet = accounts.get(0) ;
        for ( int i = 1; i < accounts.size(); i++ )
        {
            BankAccountArrayList current = accounts.get(i) ;
            if (current.getBalance() > largestYet.getBalance())
                largestYet = current ;
        }
        return largestYet ;
    }
    private final ArrayList<BankAccountArrayList> accounts ;
}