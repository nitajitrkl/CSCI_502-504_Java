import java.util.Scanner;

public class AverageTester {
    public static void main(String[] args) {
        int[] numbers = new int[4];
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the No. of Number: ");
        int num = in.nextInt();
        for (int i=0; i< num; i++){
            numbers[i] = in.nextInt();
        }
        Average sample = new Average(numbers);
        System.out.println("Average:" + sample.findAvg());
    }
}
