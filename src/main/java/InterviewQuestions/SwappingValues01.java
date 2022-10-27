package InterviewQuestions;

public class SwappingValues01 {
    public static void main(String args[]){

        int a=10,b=20;

        //1. Using third variable

        /*int t=a;
        a=b;
        b=t;
        System.out.println("a: "+a);
        System.out.println("b: "+b);*/

        //2. Without using third variable

        a=a+b;  //10+20 = 30
        b=a-b;  // 30-20 = 10
        a=a-b;  // 30-10 = 20
        System.out.println("Without Using third varible:-");
        System.out.println("Now a is: "+a+"--------"+"Now b is: "+b);
    }
}
