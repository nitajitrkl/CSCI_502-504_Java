import java.util.Random;

public class Quick_Sort {
    public void quickSort(int[] a) {
        if (a == null || a.length == 0) {
            return;
        }
        sort(a, 0, a.length - 1);
    }

    private static void sort(int[] a, int low, int high) {
        int i = low, j = high;
        int pivot = a[low + (high - low) / 2];

        while (i <= j) {
            while (a[i] < pivot) {
                i++;
            }
            while (a[j] > pivot) {
                j--;
            }
            if (i <= j) {
                int temp = a[i];
                a[i] = a[j];
                a[j] = temp;
                i++;
                j--;
            }
        }

        if (low < j) {
            sort(a, low, j);
        }
        if (i < high) {
            sort(a, i, high);
        }
    }
    public void display(int[] a) {
        for(int i:a){
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Random rand = new Random();
        for (int j = 1; j < 6; j++) {
            int[] a = new int[(int) Math.pow(10,j)];
            for(int i=0; i<a.length; i++) {
                a[i] = rand.nextInt(100);
            }
            Quick_Sort qs = new Quick_Sort();
            long startTime = System.nanoTime();
            qs.quickSort(a);
            long endTime = System.nanoTime();
            long totalTime = endTime - startTime;
            System.out.println("Quick Sort took for input Size: " + (int) Math.pow(10,j) +  "--> " + totalTime + " ns");
        }
    }
}
