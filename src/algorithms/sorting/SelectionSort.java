package algorithms.sorting;

import java.util.Random;

public class SelectionSort {

    public static void main(String[] args) {

        Random random = new Random();

        int[] arr = new int[10];
        for (int k = 0 ; k < arr.length ; k++){
            arr[k] = random.nextInt(100);
        }

        System.out.println("Before Selection Sort");
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();

        selectionSort(arr);
        System.out.println("After Selection Sort");
        for (int i : arr) {
            System.out.print(i + " ");
        }

    }

    public static void selectionSort(int[] arr){

        int length = arr.length;

        for (int i = 0; i < length - 1 ; i++){
            int minIndex = i ;
            for (int j = i+1; j < length ;j++){
                if (arr[j] < arr[minIndex]){
                    minIndex = j;
                }

            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
            }
        }
    }
}
