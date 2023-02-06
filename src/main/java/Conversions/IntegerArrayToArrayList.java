package Conversions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class IntegerArrayToArrayList {

    public static void intArrayToArrayList(int arr[]){

        List<Integer> ls = new ArrayList<>();
        for (int list:arr){
            ls.add(list);
        }
        Collections.sort(ls);
        System.out.println("Sorted Array: "+ls);

        Collections.reverse(ls);
        System.out.println("ReverseArray: "+ls);

    }

    public static void main(String[] args) {
        int[] num = {2,4,3,5,6,1,9};

        intArrayToArrayList(num);
    }
}
