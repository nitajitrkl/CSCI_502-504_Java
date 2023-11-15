public class Fibonacci_While {
    public Fibonacci_While (int n){
        num = n;
        end = 1;
        start = 0;
    }
    public void printFibonacci (){
        if (num > 0){
            int i = 1;
            while (i <= num) {
                System.out.print(" " + start);
                int next = start + end;
                start = end;
                end = next;
                i++;
            }
        } else System.out.println("Error");
    }
    private final int num;
    private int end;
    private int start;
}