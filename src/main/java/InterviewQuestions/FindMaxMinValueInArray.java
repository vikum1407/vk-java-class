package InterviewQuestions;

public class FindMaxMinValueInArray {

    public static void main(String[] args) {

        int a[] = {23,43,45,101,44,89,90};

        int max=a[0];
        /*
        *   * Assume first element as a max value, based on that compare other value with a[0]
        *   * While comparing others replace max value accordingly
        * */

        for (int i=1; i<a.length;i++){ //here starting a[1] mean a[0] already define as a max value
            if (a[i]>max){
                max=a[i];
            }
        }
        System.out.println("Max Value is "+max);

    }
}
