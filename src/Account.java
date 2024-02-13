public class Account {
    public Account (int accountNo){
        this.accountNo = accountNo;
    }
    public void deposit(double amount){
        balance += amount;
        System.out.println("Deposited!!!");
    }
    public void withdraw(double amount){
        balance -= amount;
        System.out.println("Withdrawn!!!");
    }
    public int accountNo;
    public double balance;
}

class SavingsAccount1 extends Account {

    public SavingsAccount1(int accountNo) {
        super(accountNo);
    }
}

class CheckingAccount1 extends Account {

    public CheckingAccount1(int accountNo) {
        super(accountNo);
    }
    public void withdraw (double amount){
        balance = balance - amount - fee;
        System.out.println("Transaction fee !!!");
    }
    public double getInterest (){
        System.out.println("Interest Returned!!!");
        return interest;
    }
    private double interest;
    public double fee;
}