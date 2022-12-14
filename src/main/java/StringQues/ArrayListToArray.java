package StringQues;

import java.util.ArrayList;

public class ArrayListToArray {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<String>();

        list.add("viku");
        list.add("piku");
        list.add("siku");

        System.out.println("ArrayList: "+list);

        String arra[] = list.toArray(new String[0]);

        System.out.println("After converting ArrayList to Array:");

        for (String arrayNew:arra){
            System.out.println(arrayNew);
        }
    }
}
