package InterviewQuestions;

public class FindDuplicationEleIntListInteger {

    public static void main(String args[]){

        int names[] = {1,2,3,4,5,5,6,7};

        for (int i=0; i<names.length-1; i++)
        {
            for (int j=i+1; j<names.length; j++)
            {
                if ((names[i] == names[j]) && (i != j))
                {
                    System.out.println("Duplicate Element" +names[j]);
                }
            }
        }
    }


}
