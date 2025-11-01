package CollectionClzRoom;



import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class LinkedListDefineTypes {
    public static void main(String[] args) {

        /**
         *  LinkedList class developed using Queue and List interfaces. but there is a another support from
         *  Deque interface as well.
         */

        /**
         * If you have retrieve and delete element at the same time in a list, don't use ArrayList:
         * BECAUSE -
         *      When deleting a element from the list, rest of the element will fill the grap by moving or
         *      shifting the location to the front. So there will be performance issue.
         */
        //Declare linkedlist
        LinkedList ll = new LinkedList();

        /*
         *   * Here we can store heterogeneous data(any kind of data type u can store)
         *   * Duplicate value u can store
         * */

        //If you need to store specific type of data, you can define LinkedList as follows
        LinkedList<Integer> ll1 = new LinkedList<>();
        LinkedList<String> ll2 = new LinkedList<>();

        ll.addFirst("sdc");
        ll.addLast("erf");
        ll.removeFirst();
        ll.removeLast();

        ll.getFirst();
        ll.getLast();


    }
}
