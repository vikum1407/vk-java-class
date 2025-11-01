package InterviewQuestions;

import java.util.Scanner;

public class PalindromeNumber {
    public static void main(String[] args) {

        /*
        * Eg: 121
        * when we get reverse it, it's same as the original one. called as palindrome number
        * */

        //Get the user input
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number Series: ");

        //Get the user enters number into the 'num' variable
        int num=sc.nextInt();

        int originalNum=num;

        //Reverse the number method
        int rev=0;
        while (num!=0)
        {
            rev = rev*10 + num%10;
            num = num/10;
        }
        if (originalNum==rev)
        {
            System.out.println(originalNum +" Palindrome Number");
        }else
        {
            System.out.println(originalNum +" Not a Palindrome Number");
        }
    }
}
