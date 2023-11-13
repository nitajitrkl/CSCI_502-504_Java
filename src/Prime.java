import java.util.ArrayList;
public class Prime {
    public Prime (int n){
        num = n;
        sum = 0;
    }
    public ArrayList<Integer> getPrime() {
        ArrayList<Integer> prime = new ArrayList<>();
        boolean[] primes = new boolean[num + 1];
        for (int i = 0; i< num; i++)
            primes[i] = true;

        for (int p = 2; p * p <= num ; p++) {
            if (primes[p]) {
                for (int i = p * p; i <= num; i += p)
                    primes[i] = false;
            }
        }
        for (int j = 2; j<= num; j++){
            if (primes[j]) {
                prime.add(j);
                sum++;
            }
        }
        return prime;
    }
    public int noOfPrime() {
        return sum;
    }
    private final int num;
    private int sum;
}