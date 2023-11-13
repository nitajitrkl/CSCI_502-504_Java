public class Fibonacci {
    public Fibonacci (int n){
        num = n;
        end = 1;
        start = 0;
    }
    public void printFibonacci (){
        if (num > 0){
            for (int i = 1; i <= num; i++) {
                System.out.print(" " + start);
                int next = start + end;
                start = end;
                end = next;
            }
        }
    }
    private final int num;
    private int end;
    private int start;
}
