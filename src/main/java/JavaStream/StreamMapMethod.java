package JavaStream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamMapMethod {
    public static void main(String[] args) {

        List<String> nameList = Arrays.asList("Pasindu", "Malith","Uthpala", "Lahiru","Siriwardana");

        /**
         * Update the values and save it to the new arraylist
         */
        List<String> list = new ArrayList<>();

        list = nameList.stream().map(name -> name.toUpperCase()).collect(Collectors.toList());
        System.out.println(list);

        nameList.stream().map(x->x.toUpperCase()).forEach(System.out::println);
    }
}
