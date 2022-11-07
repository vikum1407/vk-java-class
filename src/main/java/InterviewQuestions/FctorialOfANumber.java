package InterviewQuestions;

/*
* 5! = 5*4*3*2*1 => 120
* OR
*5! = 1*2*3*485 =>120
* */

public class FctorialOfANumber {
    public static void main(String[] args) {

        int num=5;

        long factorial=1; // to store a long value

        for (int i=1; i<=num; i++){
            factorial=factorial * i;
        }
        System.out.println("Factorial of a number is: "+factorial);
    }
}
