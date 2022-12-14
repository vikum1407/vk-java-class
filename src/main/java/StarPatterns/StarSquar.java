package StarPatterns;

public class StarSquar {

    public static void squarPatter(int n){

        for (int i=0; i<n; i++){

            for (int j=0; j<n; j++){
                System.out.print("* ");
            }
            System.out.println(" ");
        }

    }

    public static void main(String[] args) {
        int n=5;
        squarPatter(n);
    }
}
