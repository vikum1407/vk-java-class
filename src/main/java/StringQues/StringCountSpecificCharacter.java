package StringQues;

import java.util.Arrays;

public class StringCountSpecificCharacter {

    public static int countSpecificString(String value){

        int count = 0;

        for (int i=0; i<value.length(); i++){
            if (value.charAt(i) == 'e'){
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        String str = "interview";
        System.out.println("Count: "+countSpecificString(str));
        //char[] ch = str.toCharArray();
        //System.out.println("String to char: "+ Arrays.toString(ch));
    }
}
