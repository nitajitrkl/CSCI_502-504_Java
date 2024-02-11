class Payment {
    void processPayment (){
        System.out.println("Payment Processing!!!");
    }
}
class CreditCardPayment extends Payment {
    void processPayment (){
        System.out.println("Credit Card Payment Processing!!!");
    }
}
class PaypalPayment extends Payment {
    void processPayment (){
        System.out.println("Paypal Payment Processing!!!");
    }
}
public class PaymentTester {
    public static void main(String[] args) {
        Payment[] sample = {new CreditCardPayment(), new PaypalPayment()};
        for (Payment s: sample){
            s.processPayment();
        }
    }
}