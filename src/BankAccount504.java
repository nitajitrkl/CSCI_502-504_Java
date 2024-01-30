public class BankAccount504 {
    public void setAccountHolder (String newAccountHolder){
        this.accountHolder = newAccountHolder;
    }
    public String getAccountHolder (){
        return accountHolder;
    }
    public void setAccountNumber (int newAccountNummber){
        this.accountNumber = newAccountNummber;
    }
    public int getAccountNumber(){
        return accountNumber;
    }
    private String accountHolder;
    private int accountNumber;
}
