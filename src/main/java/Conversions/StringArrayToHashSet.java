package Conversions;

import java.util.Arrays;
import java.util.HashSet;

public class StringArrayToHashSet {

    public static void stringToHashSet(String[] str){

        HashSet<String> hs = new HashSet<String>(Arrays.asList(str));
        System.out.println(hs);

    }

    public static void main(String[] args) {
        String str[] = {"viku","siku","piku","hiku"};
        stringToHashSet(str);
    }
}
