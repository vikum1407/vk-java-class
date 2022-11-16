package CollectionClzRoom;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetMethods {
    public static void main(String[] args) {

        HashSet hs = new HashSet();

        //Add elements to the HashSet
        hs.add(100);
        hs.add("viku");
        hs.add(10.23);
        hs.add(true);
        hs.add(null);

        System.out.println(hs); //[null, 100, viku, 10.23, true] it mean order is not preserved

        //Remove element
        hs.remove(100);
        System.out.println("After removing: "+hs);

        //Perticular element is present or not
        System.out.println("Element is Present or Not: "+hs.contains("viku"));

        //isEmpty
        System.out.println("Check HashSet is empty or not"+hs.isEmpty());

        //Reading HashSet value

        //1. for each loop

        for (Object ele:hs){
            System.out.println(ele);
        }

        //2. Iterator method
        Iterator it = hs.iterator();

        while (it.hasNext()){
            System.out.println("Reading from Iterator : "+it.next());
        }
    }
}
