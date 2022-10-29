package InterviewQuestions;

import java.util.Scanner;

public class PalindromeString {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your String: ");

        String userString = sc.next();

        String org_String=userString;

        String rev="";

        for (int i=0; i<userString.length(); i++){
            rev=rev+userString.charAt(i);
        }
        System.out.println(rev);
    }
}
