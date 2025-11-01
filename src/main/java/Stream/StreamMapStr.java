package Stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StreamMapStr {
    public static void main(String[] args) {

        List<String> strList = new ArrayList<>(Arrays.asList("pasindu", "Namal", "Malith", "Lahiru", "Somadasa"));

        strList.stream().map(m -> m.length())
                .forEach(System.out::println);
    }
}
