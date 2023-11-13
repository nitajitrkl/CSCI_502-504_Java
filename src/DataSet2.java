public class DataSet2 {
    public DataSet2 () {
        i = 0;
        sum = 0;
    }
    public void addValue(int x) {
        sum += x;
        i++;
    }
    public int getSum()
    {
        return sum;
    }
    public double getAverage ()
    {
        return (double) sum / i;
    }
    private int sum;
    private int i;
}
