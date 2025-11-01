package JavaStream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamLimit {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("bus","car","lorry","bus","van","lorry","car");

        /**
         * if I need to get only 3 element from the array
         */
        list.stream().limit(3).forEach(System.out::println);

        //or
        List<String> listNew = list.stream().limit(3).collect(Collectors.toList());
        System.out.println(listNew);
    }
}
