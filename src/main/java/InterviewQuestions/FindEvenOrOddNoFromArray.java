package InterviewQuestions;

public class FindEvenOrOddNoFromArray {


    public static void main(String[] args) {

        int a[] = {2,3,4,5,6,7,8,9,11};
        int Eve_count=0;
        int Odd_count=0;

    /*    for (int i=0; i<a.length; i++){
            if (a[i]%2==0){
                Eve_count++;
            }else {
                Odd_count++;
            }
        }*/

        for (int value:a){
            if (value%2==0){
                Eve_count++;
            }else {
                Odd_count++;
            }
        }
        System.out.println("Even No Count: "+Eve_count);
        System.out.println("Odd No Count: "+Odd_count);
    }


}
