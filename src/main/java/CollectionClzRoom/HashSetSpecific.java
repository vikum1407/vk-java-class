package CollectionClzRoom;

import java.util.HashSet;

public class HashSetSpecific {
    public static void main(String[] args) {

        //Union, Intersection and difference

        HashSet<Integer> set1 = new HashSet<Integer>();

        set1.add(1);
        set1.add(2);
        set1.add(3);
        set1.add(4);
        set1.add(5);

        System.out.println("HashSet 1: "+set1);

        HashSet<Integer> set2 = new HashSet<Integer>();

        set2.add(4);
        set2.add(5);
        set2.add(6);

        System.out.println("HashSet 2: "+set2);

        // Union
        set1.addAll(set2);
        System.out.println("Union Elements"+set1);

        //Intersection
        set1.retainAll(set2);
        System.out.println("Intersection Elements: "+set1);

        //Difference
        set1.removeAll(set2);
        System.out.println("Difference Elements: "+set1);

        //Subset -> boolean
        set1.containsAll(set2);
        System.out.println("Subset of elements: "+set1.containsAll(set2)); // 1,2,3,6
    }
}
