package StringQues;

import java.util.Arrays;
import java.util.Locale;

public class StringAnagram {
    /*
     * Angram meant, a string have same characters but different meaning or meanless(different arrangement)
     *
     * */

    public static void anagramString(String val1, String val2) {

        //Convert string to the lower case
        val1 = val1.toLowerCase();
        val2 = val2.toLowerCase();

        if (val1.length() == val2.length()) {

            // covert string to the char array
            char[] ch1 = val1.toCharArray();
            char[] ch2 = val2.toCharArray();

            //sort the char array
            Arrays.sort(ch1);
            Arrays.sort(ch2);

            //if sorted char arrays are same or identical
            //then strings are anagram
            boolean result = Arrays.equals(ch1, ch2);

            if (result) {
                System.out.println(val1 + " and " + val2 + " are anagrams of each other.");
            } else {
                System.out.println(val1 + " and " + val2 + " are not anagrams of each other.");
            }


        } else {
            System.out.println(val1 + " and " + val2 + " are not anagrams of each other.");
        }

    }

    public static void main(String[] args) {
        String str1 = new String("Bored");
        String str2 = new String("Robed");
        anagramString(str1,str2);
    }
}
