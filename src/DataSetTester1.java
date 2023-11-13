import java.util.Scanner;
public class DataSetTester1 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        DataSet2 data = new DataSet2();
        int[] num = new int[4];
        System.out.println("Enter 4 numbers:");
        for (int i =0; i < 4; i++) {
            num[i] = in.nextInt();
            data.addValue(num[i]);
        }
        System.out.println("Sum: " + data.getSum());
        System.out.println("Average: " + data.getAverage());
    }
}