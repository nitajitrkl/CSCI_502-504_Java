import java.util.ArrayList;

public class BankAccountArrayListTester {
    public static void main(String[] args) {
        ArrayList<BankAccountArrayList> accounts = new ArrayList<BankAccountArrayList>();
        accounts.add(new BankAccountArrayList(1001));
        accounts.add(new BankAccountArrayList(1004, 2000));
        accounts.add(new BankAccountArrayList(1009, 3000));
        accounts.add(1, new BankAccountArrayList(1003, 4000));
        accounts.remove(0);
        System.out.println("Size: " + accounts.size());
        BankAccountArrayList first = accounts.get(0);
        System.out.println("First Account No.: " + first.getAccountNumber());
        BankAccountArrayList last = accounts.get(accounts.size()-1);
        System.out.println("Last Account No.: " + last.getAccountNumber());
        double sum = 0;
        // enhanced For - Loop
        for (BankAccountArrayList account: accounts){
            sum += account.getBalance();
        }
        System.out.println("Total Sum: " + sum);
    }
}
