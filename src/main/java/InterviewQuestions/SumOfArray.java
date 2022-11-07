package InterviewQuestions;

public class SumOfArray {
    public static void main(String[] args) {

        int[] a = {2,3,6,4,3,8};

        int sum=0;
    /*    for (int i=0; i<a.length; i++){
            sum=sum+a[i];
        } */

        //Enhance for loop
        for (int value:a)
        {
            sum=sum+value;
        }
        System.out.println("Sum of an Arry: "+sum);
    }
}
