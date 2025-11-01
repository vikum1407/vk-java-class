package JavaStream;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class StreamMatchMethods {
    public static void main(String[] args) {
        /**
         * Anymarch() -> return any match element/s [at least one element will return true]
         * Allmatch() -> return all match [all match return true if not false]
         * Nonematch() -> return not match with false and if match return true [any value match return false]
         */

        Set<String> fruties = new HashSet<String>();

        fruties.add("one apple");
        fruties.add("two mango");
        fruties.add("three banana");
        fruties.add("more graps");
        fruties.add("two guavas");

        boolean result = fruties.stream().anyMatch(value -> {return value.startsWith("one");});
        System.out.println(result);

        boolean result1 = fruties.stream().allMatch(val-> {
            return val.startsWith("one");
        });
        System.out.println(result1);

        boolean resultNone = fruties.stream().noneMatch(val->{
            return val.matches("one");
        });
        System.out.println(resultNone);


    }
}
