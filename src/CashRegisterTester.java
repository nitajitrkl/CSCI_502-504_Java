public class CashRegisterTester {
    public static void main(String[] args) {
        CashRegister customer = new CashRegister();
        customer.recordPurchase(7);
        customer.receivePayment(5, 8, 20, 0, 0);
//        System.out.println(customer.giveChange());
    }
}