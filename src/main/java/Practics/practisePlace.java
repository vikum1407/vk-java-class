package Practics;

import sun.awt.image.ImageWatched;

import java.util.*;

public class practisePlace {


    public static void main(String[] args) {

       //find duplicate value from string
        String stro[] = {"java", "c","c++","ph"};

        boolean flag=false;

        HashSet hs = new HashSet();

        for (String str:stro){
            if (hs.add(str)==false){
                System.out.println("Duplicate "+str);
                flag=true;
            }

            }
        if (flag==false){
            System.out.println("Not");
        }


    }
}
