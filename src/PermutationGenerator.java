import java.util.Random;

public class PermutationGenerator {
    public PermutationGenerator(){
        g = new Random();
    }
    public int[] nextPermutation(int n){
        int[] p = new int[n];
        for (int i=0; i<n; i++){
            p[i] = i+1;
        }
        int size = n;
        int[] r = new int[n];
        for (int i=0; i<n; i++){
            int position = g.nextInt(size);
            r[i] = p[position];
            p[position] = p[size-1];
            size--;
        }
        return r;
    }
    private Random g;
}
