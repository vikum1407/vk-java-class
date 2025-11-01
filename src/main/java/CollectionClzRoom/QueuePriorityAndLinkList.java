package CollectionClzRoom;

import java.util.LinkedList;
import java.util.PriorityQueue;

public class QueuePriorityAndLinkList {
    public static void main(String[] args) {

        /*
        *   Differences Between PriorityQueue and LinkedList
        *       - Duplicate allowed
        *       - Insertion order is preserved
        *       - Heterogeneous data allow for LinkedList but Not for PriorityQueue
        *
        * */

        PriorityQueue pq2 = new PriorityQueue();

        pq2.add(100); // Here Heterogenious data is not allowed for Priority Queue
        pq2.add("BDF");
        pq2.add("CYHN");
        pq2.offer("EDCC");

        System.out.println("Priprity Queue: "+pq2);


        LinkedList ln = new LinkedList();

        ln.add(1000);
        ln.add(23.45);
        ln.add("ASD");
        ln.add(true);
        // Here Heterogenious data is allowed for Priority Queue

        System.out.println("LinkedList Queue: "+ln);


        /*
        * In LinkedList:-
        *   - If you need to get the data -> element(), peek()
        *   - If you need to remove the data -> remove(), poll()
        *
        * */
    }
}
