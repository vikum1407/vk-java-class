package Practics;

import java.util.HashSet;

public class findDuplicateValue {

    public static void main(String[] args) {

        String arr[] = {"java","C","C++","C++"};

        boolean flag=false;

        HashSet mag = new HashSet();

        for (String str:arr){
            if (mag.add(str)==false){
                System.out.println("Duplicate Value: "+str);
                flag=true;
            }
        }
        System.out.println("there is no duplicate values");
    }
}
