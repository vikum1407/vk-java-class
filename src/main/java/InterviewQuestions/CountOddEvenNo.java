package InterviewQuestions;

public class CountOddEvenNo {

    public static void main(String[] args) {

        int no=123456;

        int odd_count=0;
        int even_count=0;

        while (no>0){
            int rem=no%10; // From here gives last number. eg;- 6

            if (rem%2==0){
                even_count++;
            }else {
                odd_count++;
            }

            no=no/10; //Eliminate the last number(remove the last number) eg: after 1st cycle 12345.6
        }

        System.out.println("Even No Count: "+even_count);
        System.out.println("Odd No Count: "+odd_count);
    }
}
