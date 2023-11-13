public class BankAccountTester{
    public static void main(String[] args){
        BankAccount checking = new BankAccount();
        checking.deposit(2000);
        checking.withdraw(500);
        System.out.println("Balance: $" + checking.getBalance());
    }
}