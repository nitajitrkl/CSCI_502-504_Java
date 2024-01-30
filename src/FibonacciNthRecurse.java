public class FibonacciNthRecurse {
    public int Recusrse(int n){
        if (n <= 1)
            return n;
        return Recusrse(n-1) + Recusrse(n-2);
    }
}
