public class SumToN {
    public int sumUpToN(int n){
        if (n > 0){
            sum = n + sumUpToN(n-1);
        }
        return sum;
    }
    public static int sum = 0;
}
