import java.util.Scanner;

public class LargestTester {
    public static void main(String[] args) {
        Largest sample = new Largest();
        Scanner in = new Scanner(System.in);
        System.out.println("Enter how many numbers you want in Array: ");
        int length = in.nextInt();
        int[] nums = new int[length];
        System.out.println("Enter those numbers: ");
        for (int i =0; i< length; i++){
            nums[i] = in.nextInt();
        }
        System.out.println("Largest: " + sample.LargestNumber(nums));
    }
}
