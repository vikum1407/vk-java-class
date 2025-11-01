package StringQues;

public class StringPalindrome {

    public static String reverseString(String str1){

        String revStr = "";
        for (int i=str1.length()-1; i>=0; i--){
            revStr = revStr + str1.charAt(i);
        }
        return revStr;
    }
    public static void main(String[] args) {
        String str = new String("rotator");
        String revstr = reverseString(str);

        if (str.equals(revstr)){
            System.out.println("The string" + str + " is a Palindrome String.");
        }
        else
        {
            System.out.println("The string" + str + " is not a Palindrome String.");
        }
    }
}
