public class AccountTester {
    public static void main(String[] args) {
        Account a = new Account(123);
        Account s = new SavingsAccount1(1234);
        Account c = new CheckingAccount1(12345);
        s.deposit(1000);
        c.withdraw(900);
    }
}
