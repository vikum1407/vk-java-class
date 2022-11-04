package InterviewQuestions;

public class FindMissingNumber {



    public static int missingFunction(int arr[]){
        int n = arr.length+1;

            int sum= n*(n+1)/2;
            int restSum=0;
            for (int i=0; i<arr.length; i++){
                restSum= restSum+arr[i];
            }

            int missingNumber = sum - restSum;

            return missingNumber;
    }

    public static void main(String[] args) {
        int[] arr1 = {1,2,3,5,6,7};
        System.out.println("Missing number is: "+missingFunction(arr1));
    }
}
