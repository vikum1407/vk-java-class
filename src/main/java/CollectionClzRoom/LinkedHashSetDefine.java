package CollectionClzRoom;

import java.util.LinkedHashSet;

public class LinkedHashSetDefine {
    public static void main(String[] args) {

        //Define
        LinkedHashSet lhs = new LinkedHashSet();
        LinkedHashSet<Integer> lhs1 = new LinkedHashSet<Integer>();

        lhs.add(104);
        lhs.add("pavi");
        lhs.add(true);
        lhs.add(4.56);

        System.out.println("LinkedHashSet: "+lhs); // insertion order is preserved
    }
}
