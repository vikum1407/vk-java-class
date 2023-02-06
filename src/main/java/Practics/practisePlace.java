package Practics;

import javax.xml.stream.events.Characters;
import java.util.*;
import java.util.regex.Pattern;

public class practisePlace {

    public static void main(String[] args) {

        String str = "WelcoMe VikuM";

        int lowerCount=0;
        int upperCount=0;

        for (int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
            if (ch>='A' && ch<='Z'){
                upperCount++;
            }else {
                lowerCount++;
            }
        }

        System.out.println("Upper Character Count: "+upperCount);
        System.out.println("Lower Character Count: "+lowerCount);
    }
}
