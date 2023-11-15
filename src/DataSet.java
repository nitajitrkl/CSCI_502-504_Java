public class DataSet {
    public DataSet (){
        sum = 0;
        max = 0;
        n = 0;
    }
    public double getAverage(){
        if (n == 0 ) return 0;
        else return sum/n;
    }
    public double getMax(){
        return max;
    }
    public void add(double x) {
        if (n==0 || max < x)
            max = x;
        sum = sum + x;
        n++;
    }
    public double getSum()
    {
        return sum;
    }
    private double sum;
    private double max;
    private double n;
}
