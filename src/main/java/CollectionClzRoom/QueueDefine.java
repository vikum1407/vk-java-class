package CollectionClzRoom;

import java.security.Permission;
import java.util.Iterator;
import java.util.PriorityQueue;

public class QueueDefine {
    public static void main(String[] args) {

        // Define Queue
        PriorityQueue pq = new PriorityQueue();

        /*
        *   * Duplicates are allowed
        *   * Insertion order is preserved
        * */

        //Adding elements   -> add(), offer()
        pq.add("A");
        pq.add("B");
        pq.add("C");
        pq.offer("C");

        System.out.println("Queue: "+pq); //Queue: [A, B, C, C]

        // How to get the header element -> element(), peek()
        System.out.println("Get the Header Element from element method: "+pq.element());
        System.out.println("Get the Header Element from peek method: "+pq.peek());

        /*
        * When the queue is empty:-
        *   - element() method return -> exception
        *   - peek() method return -> null
        * */

        PriorityQueue pq1 = new PriorityQueue();

        //System.out.println("When Queue is Empty element method Return: "+pq1.element()); // NoSuchElementException
        //System.out.println("When Queue is Empty peek method Return: "+pq1.peek());  // null

        // Return and Remove the element from the Queue -> remove(), poll()

        System.out.println("Removed Element: "+pq.remove()); // Removed Element: A [Removed the head element]
        System.out.println("After Removed, The Queue: "+pq); // After Removed, The Queue: [B, C, C]

        System.out.println("Removed Element: "+pq.poll()); // Removed Element: B [Removed the head element]
        System.out.println("After Removed, The Queue: "+pq); // After Removed, The Queue: [C, C]

        /*
         * When the queue is empty:-
         *   - remove() method return -> exception
         *   - poll() method return -> null
         * */

        //System.out.println("When Queue is Empty remove method Return: "+pq1.remove()); //NoSuchElementException
        //System.out.println("When Queue is Empty poll method Return: "+pq1.poll()); // null


        // Read the elements from the Queue
        /*
        *   1. Iterator
        *   2. For each loop
        *
        * */

        PriorityQueue pq2 = new PriorityQueue();

        pq2.add("TER");
        pq2.add("BDF");
        pq2.add("CYHN");
        pq2.offer("EDCC");

        Iterator it = pq2.iterator();

        while (it.hasNext()){
            System.out.println("Element from Queue: "+it.next());
        }

        for (Object ele:pq2)
        {
            System.out.println("For Each Loop: "+ele);
        }
    }
}
