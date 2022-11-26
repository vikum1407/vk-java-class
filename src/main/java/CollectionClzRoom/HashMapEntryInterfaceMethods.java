package CollectionClzRoom;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapEntryInterfaceMethods {
    public static void main(String[] args) {

        //HashMap hs = new HashMap();
        HashMap<Integer,String> hs = new HashMap<Integer,String>(); // Here define all Keys are integer and all value are string

        // Add data to the HashMap
        hs.put(101,"Vikum");
        hs.put(102,"Suran");
        hs.put(103,"Pavi");
        hs.put(104,"Vruna");
        hs.put(105,"Weenu");
        hs.put(106,"Weenu"); // Duplicate values are allowed, But key duplicate not allowed

        // Get the entry wise -> Entry Interface
        /*
         * When you need to do the validation for entry level, It have separate interface called Entry(I)
         *
         * */

        // 1. entrySet() -> return all entry from the Hashmap
        for (Object en:hs.entrySet()){
            System.out.println(en);
        }
     /*   101=Vikum
          102=Suran
          103=Pavi
          104=Vruna
          105=Weenu
          106=Weenu */

        // Using Entry interface
        for (Map.Entry entry:hs.entrySet()){
            System.out.println(entry.getKey()+"   "+entry.getValue());
        }
        /*  101=Vikum
            102=Suran
            103=Pavi
            104=Vruna
            105=Weenu
            106=Weenu */

        //Using Iterator method
        System.out.println("************************Iterator************************");
        Set st = hs.entrySet(); //Here retrun all entry set
        Iterator itr = st.iterator();
        while (itr.hasNext())

        {
            Map.Entry entry = (Map.Entry) itr.next();
            System.out.println(entry.getKey()+"   "+entry.getValue());
        }

    }
}
