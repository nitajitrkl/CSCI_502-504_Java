class Payment {
    Payment (int a){
    }
    double processPayment (){
        return 0;
    }
}

class CreditCardPayment extends Payment {
    CreditCardPayment(int a) {
        super(a);
        super.processPayment();
    }
    double processPayment (){
        return 1;
    }
}

class PaypalPayment extends Payment {
    PaypalPayment(int a) {
        super(a);
    }

    double processPayment (){
        return 2;
    }
}

public class PaymentTester {
    public static void main(String[] args) {
        Payment p = new Payment(6);
        p.processPayment();

    }
}