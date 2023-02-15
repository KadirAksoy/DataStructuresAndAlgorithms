package data_structures.linkedlist;

import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {
        OurLinkedList<String> ourLinkedList = new OurLinkedList<>();

        ourLinkedList.add("kadir");
        ourLinkedList.add("baran");
        ourLinkedList.add("aksoy");
        ourLinkedList.display();


        System.out.println("-----------------");

        LinkedList<String> linkedList = new LinkedList<>();

        linkedList.add("kadir");
        linkedList.add("baran");
        linkedList.add("aksoy");
        System.out.println(linkedList.get(0));
        System.out.println(linkedList.get(1));
        System.out.println(linkedList.get(2));




    }
}
