public class PermutationGeneratorTester {
    public static void main(String[] args) {
        PermutationGenerator sample = new PermutationGenerator();
        for (int i = 0; i < 10; i++) {
            print(sample.nextPermutation(10));
        }
    }
    public static void print(int[] a){
        for (int element : a){
            System.out.print(" " +  element);
        }
        System.out.println();
    }
}