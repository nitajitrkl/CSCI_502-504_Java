import java.util.Scanner;

public class RootApproximatorTester {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double aA = in.nextDouble();
        int n = in.nextInt();
        RootApproximator sample = new RootApproximator(n, aA);
        while (sample.hasMoreGuesses()){
            System.out.println(sample.nextGuess());
        }
    }
}
