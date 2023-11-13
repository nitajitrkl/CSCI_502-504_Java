public class InvestmentFor {
    public InvestmentFor (double aBalance, double aRate){
        balance = aBalance;
        rate = aRate;
        years = 0;
    }
    public void waitForYears (int n){
        for (int i = 1; i <= n ; i++){
            double interest = balance * rate /100;
            balance += interest;
        }
        years += n;
    }
    public double getBalance (){
        return balance;
    }
    public int getYears(){
        return years;
    }
    private double balance;
    private final double rate;
    private int years;
}
