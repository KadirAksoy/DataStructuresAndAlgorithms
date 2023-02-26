package algorithms.sorting;

import java.util.Random;

public class BubbleSort {

    public static void main(String[] args) {

        Random random = new Random();

        int[] arr = new int[10];
        for (int k = 0 ; k < arr.length ; k++){
            arr[k] = random.nextInt(100);
        }

        System.out.println("Before Bubble Sort");
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();

        bubbleSort(arr);
        System.out.println("After Bubble Sort");
        for (int i : arr) {
            System.out.print(i + " ");
        }

    }
    public static void bubbleSort(int[] arr){

        int length = arr.length;

        for (int i = 0 ; i < length - 1 ; i++){
            for (int j = 0 ; j < length - i -1 ; j++){
                if (arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
}
