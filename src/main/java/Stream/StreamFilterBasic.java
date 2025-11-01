package Stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamFilterBasic {
    public static void main(String[] args) {

        List<Integer> intList = new ArrayList<>();
        intList.add(34);
        intList.add(24);
        intList.add(37);
        intList.add(59);
        intList.add(64);
        intList.add(38);

        List<Integer> evenList = new ArrayList<>();

        /**
         * Filter the data and save data to another list.
         */
        evenList = intList.stream().filter(n-> n%2==0).collect(Collectors.toList());
        System.out.println(evenList);

        /**
         * Filter data and directly print.
         */
        intList.stream().filter(n ->n%2==0).forEach(p-> System.out.println(p));
        // OR
        intList.stream().filter(n ->n%2==0).forEach(System.out::println);
    }
}
