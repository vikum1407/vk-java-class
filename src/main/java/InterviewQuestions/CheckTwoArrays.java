package InterviewQuestions;

import java.util.Arrays;

public class CheckTwoArrays {
    public static void main(String[] args) {

        int a[] = {1,2,3,4,5};
        int b[] = {1,2,3,4,6};

        boolean status = Arrays.equals(a,b);

        if (status==true){
            System.out.println("Two Arrays are Equal");
        }else {
            System.out.println("Two Arrays are not Equal");
        }
    }
}
