package CollectionClzRoom;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetDefine {
    public static void main(String[] args) {

        //HashSet define
        HashSet hs = new HashSet(); //here default capacity is 16 and default load factor 0.75

        HashSet hs1 = new HashSet(100); //initial capacity is 100

        HashSet hs2 = new HashSet(100,(float) 0.95); // initial 100 capacity and load factor 0.95

        //Specific type of HashSet
        HashSet<String> hs3 = new HashSet<String>();

    }
}
