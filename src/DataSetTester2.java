import java.util.ArrayList;
import java.util.Scanner;
public class DataSetTester2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        DataSet2 data = new DataSet2();
        ArrayList<Integer> num = new ArrayList<>();
        System.out.print("Enter Number of numbers for to add: ");
        int n= in.nextInt();
        for (int i =0; i < n; i++) {
            System.out.print("Enter " + "number " +  (i+1) + ": " );
            num.add(in.nextInt());
            data.addValue(num.get(i));
        }
        System.out.println("Sum: " + data.getSum());
        System.out.print("Average: " + data.getAverage());
    }
}
