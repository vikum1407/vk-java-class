package Practics;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class StringArray {

    public static void strReverse(String[] str){
        List<String> StrList = Arrays.asList(str);

        Collections.reverse(StrList);

        String[] reverseArr = StrList.toArray(str);

    }


    public static void main(String args[]){
        String[] strArr = {"SL","India","AUS"};
        strReverse(strArr);

    }
}
