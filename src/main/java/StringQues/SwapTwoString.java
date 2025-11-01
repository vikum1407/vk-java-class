package StringQues;

public class SwapTwoString {

    public static void main(String[] args) {

        String str1 = "Hello";
        String str2 = "Vikum";

        /**
         * Concat the two strings
         */
        String str = str1+str2;
        System.out.println(str); //HelloVikum

        str2 = str.substring(0, str.length()-str1.length());
        str1 = str.substring(str.length()-str2.length());
        System.out.println("str2: "+str2);
        System.out.println("str1: "+str1);
        // or
        System.out.println(str.substring(str2.length()));

    }
}
