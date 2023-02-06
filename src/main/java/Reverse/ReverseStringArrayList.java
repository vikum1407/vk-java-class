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
        List<String> list = Arrays.asList(arr); //string array convert to list

        Collections.reverse(list); //reverse the string list

        String[] reversedArray=list.toArray(arr); //list convert to string array

        System.out.println("Reverse Array: "+Arrays.toString(reversedArray));
    }
}
