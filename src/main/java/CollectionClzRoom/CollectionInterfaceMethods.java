package CollectionClzRoom;

import java.util.ArrayList;
import java.util.List;

public class CollectionInterfaceMethods {
    /**
     * Collection (Interface):-
     *      - This is the main interface for List, Set and Queue.
     *      - It has the following methods
     *      - Below methods allow for other child interfaces(list, set, queue)
     * @param args
     */

    public static void main(String[] args) {

        List list = new ArrayList();
        list.add("sdc");    // this from collection and it doesn't take the location in the list
        list.addAll(list);  // this from collection and it doesn't take the location in the list
        list.remove("sdc");
        list.removeAll(list);
        list.retainAll(list);
        list.isEmpty();
        list.clear();
        list.size();
        list.contains(23);
        list.containsAll(list);
        list.toArray();

        List list2 = new ArrayList();

        list.add(1, "viku"); // this from List interface
        list.addAll(2, list2); // this from List interface

        list.remove(3); // this from List interface
        list.get(4);
        list.set(5, "piu");

    }
}
