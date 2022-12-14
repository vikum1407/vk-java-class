package CollectionClzRoom;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ReverseIntStringArray {
    public static void main(String[] args) {
        //Integer Reverse using Collection framework
        int[] num = {3,4,5,6,7,8,9};

        //print int array
        for (int num1:num){
            System.out.print(num1);
        }

        System.out.println();

        //int Array convert to ArrayList
        ArrayList<Integer> no = new ArrayList<Integer>();

        for (int i=0; i<num.length; i++){
            no.add(new Integer(num[i]));
        }
        System.out.println("ArrayList: "+no);

        //Reverse using collections framework
        Collections.reverse(no);
        System.out.println("reverse: "+no);

        //String Reverse using Collection framework

        String[] names = {"viki","piki","suki"};

        for (String name1:names){
            System.out.println(name1);
        }

        //String array convert to String List
        List<String> name2 = new ArrayList<String>(Arrays.asList(names));

        //Reverse using collection framework
        Collections.reverse(name2);
        System.out.println("Reverse: "+name2);
    }
}
