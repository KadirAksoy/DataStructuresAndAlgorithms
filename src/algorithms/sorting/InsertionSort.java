package algorithms.sorting;


import java.util.Random;

public class InsertionSort {
    public static void main(String[] args) {


        Random random = new Random();
        //int[] arr = {9, 14, 3, 17, 43, 33, 58, 86};
        //{9,14,3,17,  43,     33,   58,86}
        //              i,     i+1

        int[] arr = new int[10];
        for (int k = 0 ; k < arr.length ; k++){
            arr[k] = random.nextInt(100);
        }
        System.out.println("Before Insertion Sort");
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();

        insertionSort(arr);
        System.out.println("After Insertion Sort");
        for (int i : arr) {
            System.out.print(i + " ");
        }

    }
    public static void insertionSort( int[] arr){

        int length = arr.length;

        for (int i = 1; i < arr.length; i++) {   // index0 = 11   index0 + 1 = 9     index0 + 2 = 7
            int key = arr[i];                         // index0 + 1 = 9   // index0 + 2 = 7   // index0 + 1 = 9
            int j = i - 1;                        //j = 0                  // j = 1
            while ((j > -1) && (arr[j] > key)) {    //if 0 > -1 and index0 > index0 + 1 // if 1 > -1 and index0 + 1 > index0 + 2 // 11 > 9
                arr[j + 1] = arr[j];   // index0 + 2 = index0 + 1 so index0 + 2 = 9 still key = 7// index0 + 1 = 11    //index0 + 2 = 11
                j--;                  // j = 0 // j = -1   // j = 0
            }
            arr[j+1] = key;     //index0 = 7   // index0 + 1 = 9

            //end index0 = 7 , index0 + 1 = 11 , index0 + 2 = 9

        }


    }
}
