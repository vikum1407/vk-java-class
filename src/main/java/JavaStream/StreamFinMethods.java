package JavaStream;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamFinMethods {
    public static void main(String[] args) {

        /**
         * findAny(): find any element
         * findFirst(): find first element
         */

        List<String> list = Arrays.asList("viku","one","two","three","one","two");
        Optional<String> str = list.stream().findAny();
        System.out.println(str.get());

        Optional<String> strFirst = list.stream().findFirst();
        System.out.println(strFirst.get());
    }
}
