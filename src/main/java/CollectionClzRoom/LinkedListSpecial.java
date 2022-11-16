package CollectionClzRoom;

import java.util.LinkedList;

public class LinkedListSpecial {
    public static void main(String[] args) {

        /*
        * List and Queue Operation
        * */

        LinkedList ln = new LinkedList();
        ln.add("Dog");
        ln.add("Cat");
        ln.add("Dog");
        ln.add("Bug");
        ln.add("Horse");

        System.out.println(ln);

        ln.addFirst("Tiger");
        ln.addLast("Lion");

        System.out.println("After Adding new Elements"+ln);

        //Extract first and last element
        System.out.println("Get First Element: "+ln.getFirst());
        System.out.println("Get Last Element: "+ln.getLast());

        //Remove first and last element
        ln.removeFirst();
        System.out.println("After removing first element: "+ln);

        ln.removeLast();
        System.out.println("After removing last element: "+ln);

    }
}
