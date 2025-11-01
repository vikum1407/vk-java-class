package CollectionClzRoom;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListMethods {
    public static void main(String[] args) {

        /*
         *   LinkedList -
         *   - It's duplicate value is accepted
         *   - Heterogeneous data allowed
         *   - Insertion order is preserved
         *
         *  **** LinkedList mostly use for insertion due to it's saving between value's address
         *
         *   Methods -
         *   - ll.add() -> To add element
         *   - ll.get() -> To retrieve the element
         *   - ll.remove() -> to remove the element
         *   - ll.set() -> To replace
         *   - ll.contains() -> To check the element
         *   - ll.containsAll() -> To compare two LinkedList
         *   - ll.isEnable() -> To check the list is emptiness
         *   - ll.removeAll() -> To remove collection
         *
         * Special Methods -
         *   - ll.getFirst() -> To get first element
         *   - ll.getLast() -> To get Last element
         *   - ll.addFirst()
         *   - ll.addLast()
         *   - ll.removeFirst()
         *   - ll.removeLast()
         *
         * Sorting   -
         *   - Collections.sort(ll) -> To sort a linkedList
         *   - Collections.sort(ll,Collections.reverseOrder()) -> To sort in reverse order
         *   - Collections.shuffle ->  To shuffle the list
         *
         * Data Retrieve -
         *   - For loop
         *   - For each loop
         *   - Iterator
         *
         * */

//Add elements to the LinkedList
        LinkedList ll3 = new LinkedList();
        ll3.add(1000);
        ll3.add("Vik");
        ll3.add(11.25);
        ll3.add(true);
        ll3.add(null);

        System.out.println("Print LinkedList: "+ll3); // [1000, Vik, 11.25, true, null]

        //find LinkedList size
        System.out.println("LinkedList size: "+ll3.size()); // 5

        //Remove using index
        ll3.remove(3);
        System.out.println("After Removing: "+ll3); // [1000, Vik, 11.25, null]

        // Insert a object middle of LinkedList
        ll3.add(3,"Java");
        System.out.println("LinkedList After adding new: "+ll3); // [1000, Vik, 11.25, Java, null]

        // Retrieving object
        System.out.println("Element Retrieve: "+ll3.get(2)); // Element Retrieve: 11.25

        // Change or replace a value
        ll3.set(3,"C£");
        System.out.println("After changing LinkedList: "+ll3); // After changing LinkedList: [1000, Vik, 11.25, C£, null]

        // Check or present the value in the LinkedList
        System.out.println("Verify the elemen in LinkedList: "+ll3.contains("Java")); //Verify the elemen in LinkedList: false

        //isEmpty
        System.out.println("Check Empty or Not; "+ll3.isEmpty()); // Check Empty or Not; false


        /*
         *
         * Here explain how to read the data from ArrayList
         *   1. for loop
         *   2. for .. each loop
         *   3. iterator
         * */

        // 1. for loop
        System.out.println("****Using For Loop******");
        for (int i=0; i<ll3.size(); i++){
            System.out.println(ll3.get(i));
        }

        // 2. for .. each loop
        System.out.println("****Using For Each Loop******");
        for (Object ele:ll3){   //Here we define ele as Object type mean, LinkedList having different types of data
            System.out.println(ele);
        }

        // 3. iterator      --- this is an interface from collection interface
        System.out.println("****Using Iterator Loop******");
        Iterator it = ll3.iterator(); // from the ready each element fom arraylist
        while (it.hasNext()){
            System.out.println(it.next());
        }

    }
}
