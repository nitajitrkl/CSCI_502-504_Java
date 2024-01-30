public class BankAccount504Tester {
    public static void main(String[] args) {
        BankAccount504 sample = new BankAccount504();
        sample.setAccountHolder("Ajit ");
        sample.setAccountNumber(123);
        System.out.println(sample.getAccountHolder() + "has a bank account of number " + sample.getAccountNumber());
    }
}
