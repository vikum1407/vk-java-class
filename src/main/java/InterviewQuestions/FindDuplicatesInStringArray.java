package InterviewQuestions;

public class FindDuplicatesInStringArray {

    public static void main(String args[]){

        String arra[] = {"Java","C","C++","Cucumber","C"};

        boolean flag = false;

        //First loop need to get the first value from the array
        for (int i=0; i<arra.length; i++){              //Reading:- get the index[0] is 'Java' check the condition [i<arra.length] = ture then go to second for loop
                                                //When comes inside to the second loop, 2nd loop iterate untill the condition false [j<arra.length]
            //Second loop need to compare value with other values
            for (int j=i+1; j<arra.length; j++){        // Reading:- j=i+1 meant get the index[1]='C'
                if(arra[i]==arra[j]) {                   // Reading;- then compare index[0] with index[1] it's meant 'Java' == 'CC' check
                    System.out.println("Found Duplicate Element: " + arra[i]);
                    flag = true;
                }
            }
        }
        if(flag==false){
            System.out.println("Duplicate Element Not Found");
        }
    }
}
