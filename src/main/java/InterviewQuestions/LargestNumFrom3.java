package InterviewQuestions;

import javax.swing.plaf.synth.SynthEditorPaneUI;
import java.util.Scanner;

public class LargestNumFrom3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your First Number: ");
        int a = sc.nextInt();

        System.out.println("Enter Your Second Number: ");
        int b = sc.nextInt();

        System.out.println("Enter Your Third Number: ");
        int c = sc.nextInt();

        if (a>b && a>c){
            System.out.println("a is the largest number");
        }else if (b>a && b>c){
            System.out.println("b is the largest number");
        }else {
            System.out.println("c is the largest number");
        }
    }
}
