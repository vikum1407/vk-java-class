package CollectionClzRoom;

import java.util.Hashtable;

public class HashTableDefine {
    public static void main(String[] args) {

        //Define HashTable
        Hashtable ht = new Hashtable(); //empty hashtable , default size is 11 but u can increase
        //load factor is 0.75 default, but u can increase

        //Hashtable ht1 = new (initial capacity) //create hashtable with initial capacity
        //Hashtable ht1 = new (initial capacity, load factor/fill ratio)

        //If u need specific data type
        Hashtable<Integer,String> ht1 = new Hashtable<Integer,String>();
        ht1.put(1001,"ASD");        //* Keys can't duplicate as same as HashMap
        ht1.put(1002,"WED");        //* Values can duplicate as same as HashMap
        ht1.put(1003,"RFV");
        //ht1.put(null,"RFV");        * Null key is not allow for Hashtable  //NullPointException
        //ht1.put(1004,null);           * Null value also not allow // NullPointException

        System.out.println(ht1);

        // Get the value for specific key
        System.out.println(ht1.get(1002));

        //Remove key from Hashtable
        ht1.remove(1001);
        System.out.println("After Removing: "+ht1);

        //Check particualr key is present or not
        System.out.println("Is there or not: "+ht1.containsKey(104)); //true

        System.out.println("Is there the value or not: "+ht1.containsValue("WED"));

        //Hashtable empty or not
        System.out.println("Empty or Not: "+ht1.isEmpty());

        //Get the all keys
        System.out.println("All the Keys from Hashtable: "+ht1.keySet()); // this is return as a Set. because the key can't duplicate

        //Get the all values
        System.out.println("Get the All values: "+ht1.values()); // this is returning as a collection because value can duplicate

        // Get the value from loopings

        System.out.println("******************For Loop******************");
        for (int t:ht1.keySet())
        {
            System.out.println(t+"  "+ht1.get(t));
        }
    }
}
