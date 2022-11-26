package StringQues;

import java.util.Arrays;

public class StringToCharArray {
    public static void main(String[] args) {

        String str = new String("journaldev.com");

        // get the char at specific index
        //char ch = str.charAt(0);

        //character array from String
        char[] charArray = str.toCharArray();

        //System.out.println(str + " String index 0 character = " + ch);
        System.out.println(str + " String converted to character array = " + Arrays.toString(charArray));

    }
}
