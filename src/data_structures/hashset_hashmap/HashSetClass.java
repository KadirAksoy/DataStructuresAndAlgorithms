package data_structures.hashset_hashmap;

import java.util.HashSet;

public class HashSetClass {

    public static void main(String[] args) {
        HashSet<String> days = new HashSet<String>();

        days.add("Monday");
        days.add("Tuesday");
        days.add("Wednesday");
        days.add("Thursday");
        days.add("Friday");
        days.add("Saturday");
        days.add("Sunday");

        for (String i : days) {
            System.out.println(i);
        }

    }



}
