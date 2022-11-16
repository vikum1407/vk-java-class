package CollectionClzRoom;

import java.util.HashSet;

public class HashSetImportant {
    public static void main(String[] args) {

        HashSet<Integer> evenNo = new HashSet<Integer>();

        evenNo.add(2);
        evenNo.add(10);
        evenNo.add(12);
        evenNo.add(22);
        evenNo.add(28);

        System.out.println("Event No: "+evenNo); // Event No: [2, 22, 10, 12, 28]

        HashSet<Integer> even = new HashSet<Integer>();
        even.addAll(evenNo);
        even.add(14);
        System.out.println("After Adding Collection: "+even); // After Adding Collection: [2, 22, 10, 12, 28, 14]

        //Remove all objects
        even.removeAll(evenNo);
        System.out.println("After removing: "+even); // After removing: [14]
    }
}
