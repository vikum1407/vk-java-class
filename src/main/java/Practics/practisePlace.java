package Practics;

import java.util.Arrays;
import java.util.Scanner;

public class practisePlace {

    public static void main(String[] args) {

       int a[] = {1,2,3,3,4,5,6};

       boolean flag=false;

       for (int i=0; i<a.length; i++){
           for (int j=i+1; j<a.length; j++){
               if (a[i]==a[j] && i!=j){
                   System.out.println("There is a duplicate value!!!"+a[i]);
                    break;
               }
           }
       }
        System.out.println("There is no duplicate value!!!");

    }
}
