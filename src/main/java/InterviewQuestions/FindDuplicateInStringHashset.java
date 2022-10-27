package InterviewQuestions;

import java.util.HashSet;

public class FindDuplicateInStringHashset {

    public static void main(String args[]){

        String arra[] = {"Java","C","C++","Cucumber","C"};
        boolean flag=false;

        HashSet <String> lang = new HashSet();

        for (String str : arra){
            if(lang.add(str)==false){
                System.out.println("Found the Duplicate Value: "+str);
                flag=true;
            }
        }
        if (flag==false){
            System.out.println("Duplicate Value Not Found");
        }

    }

}
