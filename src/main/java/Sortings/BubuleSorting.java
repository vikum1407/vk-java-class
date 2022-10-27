package Sortings;

import java.util.Arrays;

public class BubuleSorting {

    public static void main(String args[]){
        int a[] = {4,2,1,5,3};

        System.out.println("Array Befor Sorting: "+ Arrays.toString(a));

        //Bubule Sorting
        // 1. find the length of the array
        int n=a.length;

        /*
        * I'll get two for() loops
        * one for Number of passes
        * second for loop for - comparing the element and swap the elements(while comparing first value is grater than second value
        *
        * first for loop explain:- (n-1) mean - in a bubule sorting cycling loop always less 1 from the array length
        * */
        for (int i=0; i<n-1;i++) //number of passes
        {
            for (int j=0; j<n-1; j++)   //iteration for each pass
            {
                if(a[j]>a[j+1]) //if first value is grater than second value
                {
                    int temp=a[j];                  //In each iteration
                    a[j]=a[j+1];                    // 1 Inner loop iteration , Out loop iteration n-1 time
                    a[j+1]=temp;
                }

            }
        }

        System.out.println("Array After Sorting: "+ Arrays.toString(a));

    }
}
