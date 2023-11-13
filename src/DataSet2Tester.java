import java.util.Scanner;
public class DataSet2Tester {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        DataSet2 data = new DataSet2();
        System.out.println("Enter 4 numbers");
        int num1 = in.nextInt();
        data.addValue(num1);
        int num2 = in.nextInt();
        data.addValue(num2);
        int num3 = in.nextInt();
        data.addValue(num3);
        int num4 = in.nextInt();
        data.addValue(num4);
        System.out.println("Sum: " + data.getSum());
        System.out.println("Average: " + data.getAverage());
    }
}
