public class FibonacciRecurse {

    public void printFibonacci(int start, int end, int n) {
        if (n > 0) {
            System.out.print(" " + start);
            int next = start + end;
            start = end;
            end = next;
            printFibonacci(start, end, n - 1);
        } else System.out.println("Error");
    }
}