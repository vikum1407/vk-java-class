package Conversions;

import java.util.ArrayList;
import java.util.List;

public class StringToArrayList {
    public static void main(String[] args) {

        String str = "Welcomeom";

        List<String> list = new ArrayList<>();

        for (int i=0; i<str.length(); i++){
            list.add(String.valueOf(str.charAt(i)));
        }

        System.out.println(list);
    }
}
