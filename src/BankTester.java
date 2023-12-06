public class BankTester {
    public static void main(String[] args) {
        Bank sample = new Bank();
        int dannysAccount = 0;
        int sallysAccount = 1;
        int harrysAccount = 2;
        int jerrysAccount = 3;

        sample.addAccount(new BankAccount(dannysAccount, 1000));
        sample.addAccount(new BankAccount(sallysAccount, 2000));
        sample.addAccount(new BankAccount(harrysAccount, 3000));
        sample.addAccount(new BankAccount(jerrysAccount, 10000));

        sample.deposit(dannysAccount, 200);
        sample.withdraw(sallysAccount, 500);
        sample.deposit(harrysAccount, 1000);
        sample.withdraw(jerrysAccount, 7000);
        System.out.println(sample.find(dannysAccount).getBalance());
    }
}
