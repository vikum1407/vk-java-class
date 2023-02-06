package Conversions;

import java.util.ArrayList;
import java.util.Arrays;

public class StringArrayToListArray {

    public static void stringArrayToArrayList(String str[]){

        ArrayList<String> ls = new ArrayList<>(Arrays.asList(str));
        System.out.println(ls);

    }

    public static void main(String[] args) {
        String str[] = {"viku","siku","piku","hiku"};
        stringArrayToArrayList(str);
    }
}
