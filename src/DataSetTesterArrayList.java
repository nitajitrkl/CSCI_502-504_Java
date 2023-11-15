import java.util.ArrayList;
import java.util.Scanner;
public class DataSetTesterArrayList {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        DataSet data = new DataSet();
        ArrayList<Integer> num = new ArrayList<>();
        System.out.print("Enter Number of numbers for to add: ");
        int n= in.nextInt();
        for (int i =0; i < n; i++) {
            System.out.print("Enter " + "number " +  (i+1) + ": " );
            num.add(in.nextInt());
            data.add(num.get(i));
        }
        System.out.println("Sum: " + data.getSum());
        System.out.print("Average: " + data.getAverage());
    }
}
