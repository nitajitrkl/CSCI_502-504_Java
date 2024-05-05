//CSCI651 
//LAB: Analysis of Sorting Algorithms

import java.util.Random;

public class Selection_Sort {
    public void selectionSort(int[] a) {
        for(int i=0; i<a.length-1; i++) {
            int min_index=i;
            for(int j = i+1; j<a.length; j++) {
                if(a[j] < a[min_index])
                    min_index = j;
            }
// put the minimum element in the array
            int temp = a[min_index];
            a[min_index] = a[i];
            a[i] = temp;
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
            Selection_Sort sort = new Selection_Sort();
            long startTime = System.nanoTime();
            sort.selectionSort(a);
            long endTime = System.nanoTime();
            long totalTime = endTime - startTime;
            System.out.println("Selection Sort took for input Size: " + (int) Math.pow(10,j) +  "--> " + totalTime + " ns");
        }
    }
}


