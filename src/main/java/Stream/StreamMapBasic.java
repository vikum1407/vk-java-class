package Stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamMapBasic {
    public static void main(String[] args) {

        List<String> strList = new ArrayList<>(Arrays.asList("pasindu", "Namal", "Malith", "Lahiru", "Somadasa"));
        List<String> secondList = new ArrayList<>();

        secondList = strList.stream().map(m ->m.toUpperCase()).collect(Collectors.toList());
        System.out.println(secondList);
    }
}
