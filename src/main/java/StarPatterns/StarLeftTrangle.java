package StarPatterns;

public class StarLeftTrangle {

    public static void leftTranglePattern(int n){

        // https://www.youtube.com/watch?v=xzstcj3Cuso

        for (int i=0; i<=n; i++){
            for (int j=0; j<i; j++){
                System.out.print("* ");
            }
            System.out.println(" ");
        }

    }

    public static void main(String[] args) {
        int n=5;
        leftTranglePattern(n);
    }
}
