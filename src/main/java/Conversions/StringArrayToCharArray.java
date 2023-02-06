package Conversions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StringArrayToCharArray {

    public static void stringArrayToCharArray(String[] str){

        ArrayList<String> al = new ArrayList<String>(Arrays.asList(str));

        String str1 = al.get(1);
        System.out.println(str1);
        char[] ch = str1.toCharArray();
        System.out.println(ch[0]);


    }

    public static void main(String[] args) {
        String str[] = {"viku","siku","piku","hiku"};
        stringArrayToCharArray(str);
    }
}
