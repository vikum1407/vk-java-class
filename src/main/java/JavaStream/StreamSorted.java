package JavaStream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamSorted {
    public static void main(String[] args) {

        /**
         *
         */

        List<Integer> list = Arrays.asList(34,54,11,32,67,98,90);

        list.stream().sorted().forEach(System.out::println);

        //or
        List<Integer> sortedList = list.stream().sorted().collect(Collectors.toList());
        System.out.println(sortedList);

        /**
         * sorted in reverse order
         */
        list.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);

        List<String> strList = Arrays.asList("Namal","Pansidu","Maliya","Vikum");

        strList.stream().sorted().forEach(System.out::println);
    }
}
