package ArrayInJava;

import java.util.Arrays;
import java.util.Collections;

public class ReverseIntegerArrayUsingCollections {

    static void reverse(Integer a[]){
        Collections.reverse(Arrays.asList(a));
        System.out.println(Arrays.asList(a));
    }


    public static void main(String args[]){
        Integer [] arr = {5,10,15,20,25};
        reverse(arr);
    }
}
