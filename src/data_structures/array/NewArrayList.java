package data_structures.array;

import java.util.ArrayList;
import java.util.List;

public class NewArrayList {

    public static void main(String[] args) {


        ArrayList<String> stringArray = new ArrayList<>();

        stringArray.add("kadir");
        stringArray.add("baran");
        stringArray.add("aksoy");

        System.out.println(stringArray);


        List<Integer> firstFivePrimeNumbers = new ArrayList<>();
        firstFivePrimeNumbers.add(2);
        firstFivePrimeNumbers.add(3);
        firstFivePrimeNumbers.add(5);
        firstFivePrimeNumbers.add(7);
        firstFivePrimeNumbers.add(11);

        System.out.println(firstFivePrimeNumbers);


        System.out.println(stringArray.get(2));   //  access
    }
}
