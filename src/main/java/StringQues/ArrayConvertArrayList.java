package StringQues;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayConvertArrayList {
    public static void main(String[] args) {

        String[] names = {"Rahul", "Utkarsh","Shubham", "Neelam"};

        List<String> listNames = new ArrayList<String>(Arrays.asList(names));

        System.out.println("Convert Array to ArrayList: "+listNames);

        listNames.add("vikum");
        System.out.println("Added a name to ArrayList: "+listNames);

    }
}
