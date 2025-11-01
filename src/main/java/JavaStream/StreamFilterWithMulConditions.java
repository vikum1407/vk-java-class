package JavaStream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamFilterWithMulConditions {

    public static void main(String[] args) {

        List<String> nameList = Arrays.asList("Pasindu", "Malith","Uthpala","Lahiru","Siriwardana");

        /**
         * Approach 01 - save another list
         */
        List<String> newNames = new ArrayList<String>();
        newNames = nameList.stream().filter(str->str.length()>6 && str.length()<8).collect(Collectors.toList());
        System.out.println(newNames);

        /**
         * Approach 02 - directly printing
         */
        nameList.stream().filter(str->str.length()>6 && str.length()<8).forEach(str-> System.out.println(str));

        /**
         * Approach 03 - without using lambda function in foreach
         */
        nameList.stream().filter(str->str.length()>6 && str.length()<8).forEach(System.out::println);
    }
}
