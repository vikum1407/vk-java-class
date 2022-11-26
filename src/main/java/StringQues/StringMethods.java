package StringQues;

import java.util.SplittableRandom;

public class StringMethods {
    public static void main(String[] args) {

        // String Question Reference - https://www.interviewbit.com/java-string-interview-questions/

        String str = new String("Bombuwala");

        // 01. int length(): Returns the number of characters in the String.
        System.out.println("Character Count: "+str.length());

        // 02. Char charAt(int i): Returns the character at ith index.
        System.out.println("Selected Characters: "+str.charAt(3));

        // 03. String substring (int i): Return the substring from the ith  index character to end.
        System.out.println("Starting from(ignore character which mentioned): "+str.substring(2));

        // 04. String substring (int i, int j): Returns the substring from i to j-1 index.
        System.out.println("Starting and ending: "+str.substring(1,4)); //omb
        System.out.println("Starting from: "+str.substring(4)); //uwala

        // 05. String concat( String str): Concatenates specified string to the end of this string
        String str1 = "Vikum";
        String str2 = "Vijayantha";
        System.out.println("My First and Second Names: "+str1.concat(" "+str2));
        String str3 = "Sugathadasa";
        System.out.println("My Full Name: "+str1.concat(" "+str2).concat(" "+str3));

        // 06. int indexOf (String s): Returns the index within the string of the first occurrence of the
        String s = "Learn Share Learn";
        int output = s.indexOf("Share");
        System.out.println("Character Count of Share: "+output);

        // 07. int indexOf (String s, int i): Returns the index within the string of the first occurrence of the specified string, starting at the specified index.
        String a = "Learn Share Learn";
        int in = a.indexOf("are",3);
        System.out.println(in); //8

        // 08. Int lastIndexOf( String s): Returns the index within the string of the last occurrence of the specified string
        String b = "Learn Share Learn";
        int nt = b.lastIndexOf("a");
        System.out.println(nt); //14

        // 09. boolean equals( Object otherObj): Compares this string to the specified object.
        String c = "Bombuwala";

        Boolean be = c.equalsIgnoreCase("Bombuwala");
        Boolean be1 = c.equalsIgnoreCase("bombuwala");

        // 10.  int compareTo( String anotherString): Compares two string lexicographically
        String ch1 = "vikum";
        String ch2 = "kum";

        int tr = ch1.compareTo(ch2);
        System.out.println(tr);

        // 11. String toLowerCase(): Converts all the characters in the String to lower case.
        String ch3 = "HELLO";
        System.out.println("Lower case: "+ch3.toLowerCase());

        // 12. String toUpperCase(): Converts all the characters in the String to upper case
        String ch4 = "HeLLo";
        System.out.println("Upper case: "+ch4.toUpperCase());

        // 13. String trim(): Returns the copy of the String, by removing whitespaces at both ends. It does not affect whitespaces in the middle.
        String sd = "Vikum Vijayantha";
        System.out.println(sd.trim());

        // 14.  String replace (char oldChar, char newChar): Returns new string by replacing all occurrences of oldChar with newChar.
        String bom = "Bombuwala";
        System.out.println("Replacement: "+bom.replace('B','V'));


        //**** Compare strings ****
        //1. equals()
        /*
        *   - Differences between '==' and equals() method:-
        *       - '==' is an operator
        *       - '==' compare the references(memory address) on the object
        *       - equals() compare the content, value assign to the object
        *
        * */
        String val1 = "Vikum";
        String val2 = "Vikum";
        System.out.println("Equals: "+val1.equals(val2)); //true
        System.out.println("== operator using: "+val1==val2); //false because both value has two difference address

        //2. EqualIgnoreCase()
        System.out.println("EqualIgnoreCase: "+val1.equalsIgnoreCase(val2));

        //3. CompareTo() -> This method compares input strings with each other. Upon comparison, the following value is returned
        /*
        * - If (val1>val2), a positive value is returned.
        * - If (str1==str2), 0 is returned.
        * - If (str1<str2), a negative value is returned.
        * */
        System.out.println("CompareTo: "+val1.compareTo(val2));

    }
}
