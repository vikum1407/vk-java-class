package InterviewQuestions;

import java.util.Arrays;

public class BinarySearch {
    /*
    * Binary Search Algorithm mean:-
    *   - Should have element in array according to the sorted order
    *   - Binary search starting from mid value(after doing the sorted order) = (0+9)/2 (if array elements=10)
    *
    *   -         <---M--->(choice the direction)
    *           M<Given value
    *
    *   - Then selection the suitable side of the array, ignore or side and compare with other part of and array
    *           eg:- M+1(according to the above example)
    *   - According to the above logic Mid value shifting accordingly when comparing the value greater than or not
    *   - Comparing cases:-
    *       1. key==mid
    *       2. key>mid L=MID+1
    *       3. key<mid H=MID-1
    * */

    public static void main(String[] args) {

        boolean flag=false;

        int a[] = {1,2,3,4,5,6,7,8,9,10}; //should be sorted order

        int key=5;
        int higherValue=a.length-1;
        int lower = 0;

        /*
        //Approach 01:-

        while (higherValue>=lower){
            int mid = (higherValue+lower)/2;

            if (a[mid]==key){
                System.out.println("Element Found");        //This is 1. key==mid (first condition)
                flag=true;
                break;
            }

            if (a[mid]<key){
                lower=mid+1;
            }

            if (a[mid]>key){
                higherValue=mid-1;
            }
        }

        if (flag==false){
            System.out.println("Element Not Found !!!");
        }
        */

        //Approach 02:- Arrays.binarySearch()

        System.out.println(Arrays.binarySearch(a,key));
    }
}
