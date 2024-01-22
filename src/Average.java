public class Average {
    public Average (int[] aNumbers){
        numbers = aNumbers;
    }
    public static double findAvg (){
        for (int number : numbers) {
            sum = sum + number;
        }
        return (double) sum / numbers.length;
    }
    private static int[] numbers;
    private static int sum;
}
