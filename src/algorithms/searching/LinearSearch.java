package algorithms.searching;

import java.util.Random;

public class LinearSearch {

    public static void main(String[] args) {

        Random random = new Random();

        int[] arr = new int[10];
        for (int k = 0 ; k < arr.length ; k++){
            arr[k] = random.nextInt(10);
        }
        for (int i : arr) {
            System.out.print(i + " ");
        }System.out.println("-------------");
        int y = 5;
        System.out.println("Your number :");
        int result = linearSearch(arr,y);
        System.out.println(result);

    }

    public static int linearSearch(int[] arr, int x){

        for (int i = 0; i < arr.length; i++){
            if (arr[i] == x){
                return i;
            }
        }
        return -1;


    }



}
