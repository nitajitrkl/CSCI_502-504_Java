import java.util.Scanner;
public class DataSetTester {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        DataSet data = new DataSet();
        System.out.println("Enter 4 numbers: ");
        int num1 = in.nextInt();
        data.add(num1);
        int num2 = in.nextInt();
        data.add(num2);
        int num3 = in.nextInt();
        data.add(num3);
        int num4 = in.nextInt();
        data.add(num4);
        System.out.println("Sum: " + data.getSum());
        System.out.println("Average: " + data.getAverage());
    }
}