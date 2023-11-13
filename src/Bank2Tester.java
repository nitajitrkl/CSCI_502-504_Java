public class Bank2Tester {
    public static void main(String[] args) {
        Bank2 sample = new Bank2();
        sample.addAccount(new BankAccountArrayList(1001, 20000));
        sample.addAccount(new BankAccountArrayList(1015, 10000));
        sample.addAccount(new BankAccountArrayList(1729, 15000));
        double threshold = 30000;
        int c = sample.count(threshold);
        System.out.println(c + " accounts with Balance >= " + threshold);
        int accountNumber = 1015;
        BankAccountArrayList a = sample.find(accountNumber);
        if (a==null){
            System.out.println("No account with this account number..." + accountNumber);
        } else {
            System.out.println("Account with Number " + accountNumber + " has balance: " + a.getBalance());
        }
        BankAccountArrayList max = sample.getMaximum();
        System.out.println("\nAccount with number " + max.getAccountNumber() + " has the largest balance ($" + max.getBalance() + ")" );
    }
}
