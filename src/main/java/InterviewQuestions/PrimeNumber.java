package InterviewQuestions;

/*
* 1. Natural Number > 1
* 2. Which has only 2 factors 1 and itself
*
*19 -> 1 and 19 => Prime Number
* 28 -> 1,2,4,7,14,28 => Not a Prime Number
* */
public class PrimeNumber {
    public static void main(String[] args) {

        int num=5;
        int count=0;

        if (num>1){

            for (int i=1; i<=num; i++) {
                if (num % i == 0)
                    count++;        // Here count each number got 0 mode
            }
                    if (count==2){  //Here, there are more than 2 value for the related value it is not a prime number
                        System.out.println("This is a Prime Number");
                    }else {
                        System.out.println("This is not a Prime Number"); //because there are more than 2 factors
                    }


        }else {
            System.out.println("Not a Palindrome Number");
        }


    }
}
