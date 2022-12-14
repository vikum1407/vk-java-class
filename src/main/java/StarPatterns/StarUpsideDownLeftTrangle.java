package StarPatterns;

public class StarUpsideDownLeftTrangle {

    public static void upsideDownLeftTrangle(int n){
        for (int i=1; i<=n; i++){
            for (int j=i; j<=n; j++){
                System.out.print("* ");
            }
            System.out.println(" ");
        }

    }

    public static void main(String[] args) {
        int n=5;
        upsideDownLeftTrangle(n);
    }
}
