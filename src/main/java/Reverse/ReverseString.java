package Reverse;

public class ReverseString {

    public static void main(String[] args){

        String str = "vikumsugathadasa";
        System.out.println(reverse(str));

    }

    public static String reverse(String in){
        //StringBuilder in Java represents a mutable sequence of characters.
        StringBuilder out = new StringBuilder();
        char[] chars = in.toCharArray();

        for (int i=chars.length-1; i>=0; i--)
            out.append(chars[i]);

        return out.toString();
    }
}
