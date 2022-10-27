package ArrayInJava;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ReverseStringArrayList {

    public static void main(String args[]){

        String[] inputArray = {"India","USA","EUO","AUS"};
        System.out.println("Array Without Reverse :"+ Arrays.toString(inputArray));
        reverseArray(inputArray);

    }

    public static void reverseArray(String arr[]){
        List<String> list = Arrays.asList(arr);

        Collections.reverse(list);

        String[] reversedArray=list.toArray(arr);

        System.out.println("Reverse Array: "+Arrays.toString(reversedArray));
    }
}
