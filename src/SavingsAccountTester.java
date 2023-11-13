public class SavingsAccountTester {
    public static void main(String[] args) {
        SavingsAccount savings = new SavingsAccount(1, 100);
        for (int i=0; i<5; i++) {
            savings.addInterest();
        }
        System.out.print("The balance is $");
        System.out.println(savings.getBalance());
    }
}
