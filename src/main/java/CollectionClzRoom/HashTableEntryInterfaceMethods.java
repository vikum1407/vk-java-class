package CollectionClzRoom;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashTableEntryInterfaceMethods {
    public static void main(String[] args) {
        Hashtable<Integer,String> ht1 = new Hashtable<Integer,String>();
        ht1.put(1001,"ASD");        //* Keys can't duplicate as same as HashMap
        ht1.put(1002,"WED");        //* Values can duplicate as same as HashMap
        ht1.put(1003,"RFV");
        //ht1.put(null,"RFV");        * Null key is not allow for Hashtable  //NullPointException
        //ht1.put(1004,null);           * Null value also not allow // NullPointException

        //Entry Specific Methods
        for (Map.Entry entry: ht1.entrySet()) //(key ,value )
        {
            System.out.println(entry.getKey()+"   "+entry.getValue());
        }


        //Iterator Method
        System.out.println("******************Iterator******************");

        Set st = ht1.entrySet();
        Iterator it = st.iterator();

        while (it.hasNext())
        {
           Map.Entry entry = (Map.Entry) it.next();
            System.out.println(entry.getKey()+"   "+entry.getValue());
        }
    }
}
