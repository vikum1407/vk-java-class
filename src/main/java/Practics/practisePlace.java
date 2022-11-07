package Practics;

import java.util.Arrays;
import java.util.Scanner;

public class practisePlace {

    public static void main(String[] args) {

        System.out.println("Enter Your No: ");
        Scanner sc = new Scanner(System.in);

        int num=sc.nextInt();
        int org_num=num;

        int rev=0;
        while (num!=0) {
            rev = rev * 10 + num % 10;
            num = num / 10;
        }
            if (org_num==rev){
                System.out.println("Palindrom");
        }else {
                System.out.println("Not a Palindrom");
            }

    }
}
