package data_structures.queue;

import java.sql.Array;
import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.Queue;

public class Main {

    public static void main(String[] args) {
        OurQueue<Integer> ourQueue = new OurQueue(3);

        ourQueue.enqueue(1);
        ourQueue.enqueue(2);
        ourQueue.enqueue(3);

        ourQueue.printQueue();

        ourQueue.dequeue();
        ourQueue.dequeue();

        ourQueue.printQueue();

        Queue<String> queue = new PriorityQueue<>();
        queue.add("kadir");
        queue.add("baran");
        queue.add("aksoy");


        System.out.println(queue);



    }
}
