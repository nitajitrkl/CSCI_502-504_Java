public class Fibonacci_NthNumber {
    public Fibonacci_NthNumber (){
        fold1 = 1;
        fold2 = 1;
        fnew = 1;
    }
    public int nextNumber(){
        fnew = fold1 + fold2;
        fold2 = fold1;
        fold1 = fnew;
        return fnew;
    }
    private int fold1;
    private int fold2;
    private int fnew;
}
