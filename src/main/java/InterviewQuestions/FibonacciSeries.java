package InterviewQuestions;

/*
* Fibonacci series mean:- first value + second value =sum will generate next number
* Login:- N1+N2 become N3 and now N2 should N1 and N3(N1+N2) become N2
*
*Fibonacci series - 0 1 1 2 3 5 8 13 21
* */
public class FibonacciSeries {
    public static void main(String[] args) {

    int n1=0, n2=1, sum=0;

        System.out.println(n1+" "+n2);

        // Here starting i=2 mean already start the series first and second value
        for (int i=2; i<10; i++){
            sum=n1+n2; // 1 + 1
            System.out.print(" "+sum); // 1 2
            n1=n2;
            n2=sum;
        }
    }
}

//n1 n2 n3 n4 n5 n6 n7 n8
//n1+n2=n3 n2+n3=n4 n3+n4=n5