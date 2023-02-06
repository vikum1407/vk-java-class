package JavaQuestions;

public class SwapTwoNumbersWithout3Variable {

    public static  void swapNumbers(int a, int b){
        b=b+a;
        a=b-a;
        b=b-a;

        System.out.println("After Swapping: "+ "a = "+a +" b = "+b);
    }

    public static void main(String args[]){
        int a=10;
        int b=20;
        swapNumbers(a,b);
    }
}
