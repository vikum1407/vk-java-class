package JavaQuestions;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

public class CheckVowels {

    public static void main(String args[]){
        System.out.println(stringContainsVowels("Hello")); // true
        System.out.println(stringContainsVowels("TV")); // false

    }

    public static boolean stringContainsVowels(String input){

        //return input.toLowerCase().matches(".*[aeiou].*");
        return input.toLowerCase().matches(".*[aeiou].*");
    }


    /* **************SAME EXAMPLE DONE WITH HASHSET********************* */

    /*String[] vowels = {"a","e","i","o","u"};
    HashSet<String> hs = new HashSet<>(Arrays.asList(vowels));

    Iterator it = hs.iterator();
        while (it.hasNext()) {
        System.out.print(" "+ it.next());
    }

        System.out.println(" ");

    boolean flag=false;

    String[] str = {"e","c","n"};
        for (String sss:str){
        if (hs.add(sss)==false){
            //System.out.println(sss+" is not a vowel");
            System.out.println(sss+" this is a vowel");
            flag=true;
        }
    }

        System.out.println(" ");

        System.out.println("After adding new array:: ");

        hs.addAll(Arrays.asList(str));

    Iterator it1 = hs.iterator();
        while (it1.hasNext()) {
        System.out.print(" "+ it1.next());
    }
  }*/
}
