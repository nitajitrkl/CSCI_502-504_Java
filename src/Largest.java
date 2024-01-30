public class Largest {
    public int LargestNumber(int[] nums){
        largest = nums[0];
        for (int num: nums) {
            if(largest < num)
                largest = num;
        }
        return largest;
    }
    public static int largest;
}
