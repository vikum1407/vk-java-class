package CollectionClzRoom;

import java.util.Collections;
import java.util.LinkedList;

public class LinkedListImportant {
    public static void main(String[] args) {

        // How to add multiple elements to the LinkedList
        LinkedList al = new LinkedList();

        al.add("A");
        al.add("V");
        al.add("C");
        al.add("D");
        al.add("E");

        LinkedList al2 = new LinkedList();
        al2.addAll(al);
        System.out.println("After Adding linkedList: "+al2);

        al2.removeAll(al2);
        System.out.println("After removing All: "+al2);

        // Sorting
        System.out.println("Befor Sorting******"+al); // [A, V, C, D, E]

        Collections.sort(al);
        System.out.println("After Sorting*** "+al); // [A, C, D, E, V]

        //Sorting from reverse order
        Collections.sort(al,Collections.reverseOrder());
        System.out.println("Sorting from Reverse Order: "+al);

        //Shuffling
        Collections.shuffle(al);
        System.out.println("After Shuffling "+al);
    }
}
