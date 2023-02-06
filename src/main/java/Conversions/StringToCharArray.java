package Conversions;

public class StringToCharArray {

    public static void stringToCharArray(String str){

        char[] ch = str.toCharArray();
        System.out.println(ch);
        System.out.println(ch[2]);
    }

    public static void main(String[] args) {
        String str = "vikum";
        stringToCharArray(str);

    }
}
