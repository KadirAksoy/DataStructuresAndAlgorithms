package data_structures.array;

import java.util.Random;

public class NormalArray {


    public static void main(String[] args) {


        String[] stringArray = new String[10];

        stringArray[5] = "kadir";
        stringArray[6] = "baran";
        stringArray[1] = "aksoy";

        System.out.println(stringArray[5]);
        System.out.println(stringArray[6]);
        System.out.println(stringArray[1]);
        System.out.println(stringArray[0]);    // return null

        int[] intArray = new int[4];

        for (int i = 0; i < intArray.length; i++) {

            intArray[i] = i;
            System.out.println(intArray[i]);
        }

        Random random = new Random();

        int note;

        Object studentClass[][] = new Object[5][2];
        String[] student = {"Mert", "Kadir", "Baran", "Bülent", "Metehan"};

        for (int i = 0; i < 5; i++) {
            studentClass[i][0] = student[i];
        }

        for (int i = 0; i < 5; i++) {
            note = random.nextInt(100);
            studentClass[i][1] = note;
        }

        for (int i = 0; i < 5; i++) {
            System.out.println("Student name : " + studentClass[i][0] + "note : " + studentClass[i][1]);
        }


    }

}
