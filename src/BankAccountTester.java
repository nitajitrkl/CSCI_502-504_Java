public class BankAccountTester{
    public static void main(String[] args){
        BankAccount checking = new BankAccount(1231313, 123);
        checking.deposit(2000);
        checking.withdraw(500);
        System.out.println("Bank Account Number: "+ checking.getAccountNumber() + " Balance: $" + checking.getBalance());
    }
}