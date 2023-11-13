import java.util.Random;
public class DataSetTester {
    public static void main(String[] args) {
        DataSet sample = new DataSet();
        Random g = new Random();
        for (int i = 0; i< 100; i++){
            sample.add(Math.random ()*1000);
        }
        System.out.println("The average is: " + sample.getAverage());
        System.out.println("The maximum value is: " + sample.getMax());
    }
}