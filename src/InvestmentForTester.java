public class InvestmentForTester {
    public static void main (String [] args){
        final double initial_Balance = 100;
        final double rate = 5;
        final int years = 15;
        InvestmentFor invest = new InvestmentFor(initial_Balance, rate);
        invest.waitForYears(years);
        System.out.printf("The Balance after %d years is %.2f\n", invest.getYears(), invest.getBalance());
    }
}
