package Stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamFilterRemoveNullValue {
    public static void main(String[] args) {

        List<String> strList = new ArrayList<>(Arrays.asList("pasindu", "Namal", null, "Malith", "Lahiru", "Somadasa"));
        List<String> withoutNull = new ArrayList<>();

        withoutNull = strList.stream().filter(n -> n!=null).collect(Collectors.toList());
        System.out.println(withoutNull);
    }
}
