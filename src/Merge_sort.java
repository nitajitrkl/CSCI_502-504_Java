import java.util.Random;

//CSCI651
//LAB: Analysis of Sorting Algorithms
public class Merge_sort {
    public void merge(int[] arr, int l, int m, int r) // Merge two subarrays L and M into arr
    {
        int n1 = m - l + 1;
        int n2 = r - m;
        int[] L = new int[n1];
        int[] R = new int[n2];
        for (int i = 0; i < n1; ++i)
            L[i] = arr[l + i];
        for (int j = 0; j < n2; ++j)
            R[j] = arr[m + 1 + j];
// Maintain current index of sub-arrays and main array
        int i = 0, j = 0;
        int k = l;
// Until we reach either end of either L or M, pick larger among
// elements L and M and place them in the correct position at
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                arr[k] = L[i];
                i++;
            }
            else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }
// When we run out of elements in either L or M,
// pick up the remaining elements and put in A[p..r]
        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }
        while (j < n2) {
            arr[k] = R[j];
            j++;
            k++;
        }
    }
    public void sort(int[] arr, int l, int r)
    {
        if (l < r) {
            int m = l + (r - l) / 2;
            sort(arr, l, m);
            sort(arr, m + 1, r);
            merge(arr, l, m, r);
        }
    }
    public static void display(int[] a) {
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
            Merge_sort ms = new Merge_sort();
            long startTime = System.nanoTime();
            ms.sort(a, 0, a.length - 1);
            long endTime = System.nanoTime();
            long totalTime = endTime - startTime;
            System.out.println("Merge Sort took for input Size: " + (int) Math.pow(10,j) +  "--> " + totalTime + " ns");
        }
    }
}