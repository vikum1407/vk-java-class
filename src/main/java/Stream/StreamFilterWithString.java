package Stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamFilterWithString {
    public static void main(String[] args) {

        /**
         * List down following name list. The name length should more than 4 and no more than 10.
         */

        List<String> strList = new ArrayList<>(Arrays.asList("pasindu", "Namal", "Malith", "Lahiru", "Somadasa"));
        List<String> seconStr = new ArrayList<>();

        seconStr = strList.stream().filter(n-> n.length()>4 && n.length()<8).collect(Collectors.toList());
        System.out.println(seconStr);
    }
}
