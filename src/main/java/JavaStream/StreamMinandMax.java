package JavaStream;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamMin {
    public static void main(String[] args) {

        /**
         * Min() method is a none-terminal method
         */

        List<Integer> noList = Arrays.asList(23,43,11,31,51,56);

        Optional<Integer> min = noList.stream().min((val1, val2)-> {return val1.compareTo(val2);});
        System.out.println(min.get());
    }
}
