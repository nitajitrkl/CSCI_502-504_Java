import java.util.Scanner;
public class MonthTester {
    public static void main(String [] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the Month Number: ");
        int month = in.nextInt();
        if (month > 0 && month <=12) {
            Month days = new Month(month);
            System.out.print(days.getDays());
        }
        else System.out.print("Invalid Input");
    }
}