package CollectionClzRoom;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDefineTypes {

    //Declare ArrayList
    ArrayList al = new ArrayList();
    /*
    *   * Here we can store hetrogenius data(any kind of data type u can store)
    *   * Insertion order preserved
    *   * Duplicate value u can store
    * */

    //If you need to store specific type of data, you can define arralist as follows
    ArrayList<String> al2 = new ArrayList<String>(); //String type data only you can store here
    ArrayList<Integer> ing = new ArrayList<Integer>(); //Int type data only can store here

    //ArrayList is a class and it's develop user List interface. so you define arraylist as follows
    List al3 = new ArrayList();

}
