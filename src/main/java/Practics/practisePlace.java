package Practics;

public class practisePlace {

    public static int missingMethod(int array[]){

        int n = array.length +1;

        int sum=n*(n+1)/2;

        int revSum=0;
        for (int i=0; i<array.length; i++){
            revSum+=array[i];
        }

        int MissingNo = sum - revSum;

        return MissingNo;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,5,6,7,8,9};
        System.out.println("Missing No is: "+missingMethod(arr));
    }
}
