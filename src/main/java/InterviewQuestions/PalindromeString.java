package InterviewQuestions;

import java.util.Scanner;

public class PalindromeString {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your String: ");

        String userString = sc.next();

        String org_String=userString;

        String rev="";


        for (int i=userString.length()-1; i>=0; i--){
            rev=rev+userString.charAt(i);
            //System.out.println(rev);
        }
       // System.out.println(rev);
        if (org_String.equals(rev)){
            System.out.println(org_String+" is a Palindrome String");
        }else {
            System.out.println(org_String+" is a not Palindrome String");
        }
    }
}
