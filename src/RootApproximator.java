public class RootApproximator {
    public RootApproximator (int num, double aA){
        a = aA;
        n = num;
        xOld = 1;
        xNew = a;
    }
    public double nextGuess(){
        xOld = xNew;
        xNew = xOld * (1 - 1.0 / n) + a / (n * Math.pow(xOld, n - 1));
        return xNew;
    }
    public boolean hasMoreGuesses(){
        final double DELTA = 0.000001;
        return (Math.abs(xNew - xOld) > DELTA);
    }
    public int n;
    public double a;
    public double xOld;
    public double xNew;
}