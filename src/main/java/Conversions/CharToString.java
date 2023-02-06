package Conversions;

public class CharToString {

    public static void charToString(char[] ch){
        String str = ch.toString();
        System.out.println(str);
    }

    public static void main(String[] args) {
        char[] ch = {'c','v','b'};
        charToString(ch);
    }
}
