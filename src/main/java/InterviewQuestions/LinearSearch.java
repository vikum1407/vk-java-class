package InterviewQuestions;

public class LinearSearch {

    public static void main(String[] args) {

        int a[] = {10,30,40,20,50};

        /*
        * LinearSearch meant find a value to equal with suggested value.
        * To do that compare the suggested value with each and every element with the array.
        *
        * */

        int search = 70;
        for (int i=0; i<a.length; i++){
            if (search==a[i]){
                System.out.println("Search value is "+a[i]);
                break;
            }
        }

        System.out.println("There is no equal value");
    }
}
