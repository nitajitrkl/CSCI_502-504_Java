public class CashRegister {
    public CashRegister () {
        purchase = 0;
        payment = 0;
    }
    public void recordPurchase(double amount)
    {
        purchase = purchase + amount;
    }
    public void receivePayment(double dollars, double quarters, double dimes, double nickels, double pennies) {
        payment = dollars + quarters * QUARTER_VALUE + dimes * DIME_VALUE
                + nickels * NICKEL_VALUE + pennies * PENNY_VALUE;
    }
    public double giveChange() {
        double change = payment - purchase;
        purchase = 0;
        payment = 0;
        return change;
    }
    public void enterPayment(int coinCount, Coin coinType){
        payment = payment + coinCount * coinType.getValue();
    }
    private double purchase;
    private double payment;
    public static final double QUARTER_VALUE = 0.25;
    public static final double DIME_VALUE = 0.1;
    public static final double NICKEL_VALUE = 0.05;
    public static final double PENNY_VALUE = 0.01;
}
