package CollectionClzRoom;

import java.util.HashMap;

public class HashMashMethods {
    public static void main(String[] args) {

        // HashMash define
        HashMap hs = new HashMap();
        HashMap<Integer,String> hs1 = new HashMap<Integer,String>(); // Here define all Keys are integer and all value are string

        // Add data to the HashMap
        hs.put(101,"Vikum");
        hs.put(102,"Suran");
        hs.put(103,"Pavi");
        hs.put(104,"Vruna");
        hs.put(105,"Weenu");
        hs.put(106,"Weenu"); // Duplicate values are allowed, But key duplicate not allowed

        System.out.println(hs); // {101=Vikum, 102=Suran, 103=Pavi, 104=Vruna, 105=Weenu, 106=Weenu}

        // GET method
        System.out.println(hs.get(105)); // Weenu

        // Remove method
        hs.remove(103);
        System.out.println("After Removing: "+hs); // {101=Vikum, 102=Suran, 104=Vruna, 105=Weenu, 106=Weenu}

        // containsKey
        System.out.println(hs.containsKey(102)); // true

        //containsValue
        System.out.println(hs.containsValue("Vku")); //false

        //Check HashMap empty or not
        System.out.println(hs.isEmpty()); //false

        //How to get only get keys from HashMap
        System.out.println("Get All the Keys: "+hs.keySet()); //Get All the Keys: [101, 102, 104, 105, 106]

        // This is a collection of values
        System.out.println("Get All the Values: "+hs.values()); //Get All the Values: [Vikum, Suran, Vruna, Weenu, Weenu]

        // Get all entry as a set
        System.out.println(hs.entrySet()); // [101=Vikum, 102=Suran, 104=Vruna, 105=Weenu, 106=Weenu]

        //How to get the key individually

        for (int ky:hs1.keySet()){ //here ur hashMap is initialized as Integer, String u can convert in to int in for loop
            System.out.println("Using for loop with int,string HashMap"+ky);
        }

        for (Object ky:hs.keySet()){ //here ur hashMap is initialized as common u need to convert in to Object in for loop
            System.out.println("Using for loop with common HashMap"+ky);
        }




    }
}
