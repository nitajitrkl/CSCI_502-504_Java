public class FibonacciRecurse {
    public void printFibonacci(int start, int end, int n) {
        if (n > 0) {
            System.out.print(" " + start);
            printFibonacci(end, start + end, n - 1);
        }
    }
}