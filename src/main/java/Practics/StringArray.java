package Practics;

import java.util.*;

public class StringArray {

    public static boolean canSegmentString(String s, Set<String> dictionary){

        for (int i=1; i<=s.length(); i++){
            String first = s.substring(0,i);
            if(dictionary.contains(first)){
                String second = s.substring(i);

                if (second == null || second.length() == 0 || dictionary.contains(second) || canSegmentString(second, dictionary)){
                    return true;
                }
            }
        }
        return false;

    }

    public static void main(String[] args) {
        Set<String> dictionary = new HashSet<String>();
        String s = new String();
        s = "hellonow";

        dictionary.add("hellow");
        dictionary.add("hell");
        dictionary.add("on");
        dictionary.add("now");


    }
}
