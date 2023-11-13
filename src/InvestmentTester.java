public class InvestmentTester {
    public static void main (String [] args){
        final double initial_Balance = 100;
        final double rate = 5;
        Investment invest = new Investment(initial_Balance, rate);
        invest.waitForBalance(2 * initial_Balance);
        int years = invest.getYears();
        System.out.println(invest.getBalance());
        System.out.println("The investment doubled after "+ years + " Years");
    }
}