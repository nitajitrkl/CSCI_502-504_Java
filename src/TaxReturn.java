public class TaxReturn {
    public TaxReturn(double anIncome, String aStatus) {
        income = anIncome;
        status = aStatus;
    }
    public double getTax() {
        double tax;
        if (status.equalsIgnoreCase("S")) {
            if (income <= SINGLE_CUTOFF1)
                tax = RATE1 * income;
            else if (income <= SINGLE_CUTOFF2)
                tax = SINGLE_BASE2
                        + RATE2 * (income - SINGLE_CUTOFF1);
            else
                tax = SINGLE_BASE3
                        + RATE3 * (income - SINGLE_CUTOFF2);
        } else {
            if (income <= MARRIED_CUTOFF1)
                tax = RATE1 * income;
            else if (income <= MARRIED_CUTOFF2)
                tax = MARRIED_BASE2
                        + RATE2 * (income - MARRIED_CUTOFF1);
            else
                tax = MARRIED_BASE3
                        + RATE3 * (income - MARRIED_CUTOFF2);
        }
        return tax;
    }
    private final double income;
    private final String status;
    final double RATE1 = 0.15;
    final double RATE2 = 0.28;
    final double RATE3 = 0.31;

    final double SINGLE_CUTOFF1 = 21450;
    final double SINGLE_CUTOFF2 = 51900;

    final double SINGLE_BASE2 = 3217.50;
    final double SINGLE_BASE3 = 11743.50;

    final double MARRIED_CUTOFF1 = 35800;
    final double MARRIED_CUTOFF2 = 86500;

    final double MARRIED_BASE2 = 5370;
    final double MARRIED_BASE3 = 19566;
}
