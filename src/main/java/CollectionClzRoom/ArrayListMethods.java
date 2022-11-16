package CollectionClzRoom;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ArrayListMethods {

    public static void main(String[] args) {

        ArrayList al = new ArrayList();

        // Add elements to the arrayList
        al.add("Vikum");
        al.add(1000);
        al.add(12.5);
        al.add(true);
        al.add('A');

        System.out.println(al); // [Vikum, 1000, 12.5, true, A]

        //Get the size of the arrayList
        System.out.println("Size of the ArrayList: "+al.size());    // Size of the ArrayList: 5

        //Remove element
        al.remove(1); // Here remove from index
        al.remove("Vikum"); //Here remove from value
        System.out.println("After removing element: "+al); // [12.5, true, A]

        // Insert a new element using index
        al.add(2,"Python");
        System.out.println("After adding new element: "+al);    // After adding new element: [12.5, true, Python, A]

        // Retrieve specific value from the arralist
        al.get(2);
        System.out.println("Retrieve Specific element: "+al.get(2));    // Retrieve Specific element: Python

        // Change or Replace with new element
        al.set(2,"Java");
        System.out.println("After replace new value: "+al.set(2,"Java")); //After replace new value: Java

        //Searching a element
        System.out.println("Searching: "+al.contains("Java")); //Searching: true *boolean value*
        System.out.println("Searching: "+al.contains("C#")); //Searching: false

        //Check arraylist is empty or not
        System.out.println("Check ArrayList Empty or Not: "+al.isEmpty()); // Check ArrayList Empty or Not: false  *boolean value*

        // Add collection of objects
        ArrayList al2 = new ArrayList();
        al2.add("A");
        al2.add("Z");
        al2.add("C");
        al2.add("D");
        al2.add("E");

        //Here explain how to add collection of element at once to the arraylist
        ArrayList al_dup= new ArrayList();
        System.out.println("Collection of Element add at once: "+al_dup);

        //Remove all element from arraylist
        System.out.println("After removing all elements: "+al_dup.removeAll(al2));


        /* Sorting */
        System.out.println("Element in ArrayList:"+al2);

        Collections.sort(al2);
        System.out.println("****After Sorting*****: "+al2);

        // Sort in decending order
        Collections.sort(al2,Collections.reverseOrder());
        System.out.println("****After Sorting Reverse Order*****: "+al2);

        // How to shuffle the collection
        Collections.shuffle(al2);
        System.out.println("After Shuffling; "+al2);
        /*
        *
        * Here explain how to read the data from ArrayList
        *   1. for loop
        *   2. for .. each loop
        *   3. iterator
        * */

        // 1. for loop
        System.out.println("****Using For Loop******");
        for (int i=0; i<al.size(); i++){
            System.out.println(al.get(i));
        }

        // 2. for .. each loop
        System.out.println("****Using For Each Loop******");
        for (Object ele:al){
            System.out.println(ele);
        }

        // 3. iterator      --- this is an interface from collection interface
        System.out.println("****Using Iterator Loop******");
        Iterator it = al.iterator(); // from the ready each element fom arraylist
        while (it.hasNext()){
            System.out.println(it.next());
        }



    }
}
