package JavaStream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamDistinact {
    public static void main(String[] args) {

        List<String> list = Arrays.asList("bus","car","lorry","bus","van","lorry","car");

        list.stream().distinct().forEach(System.out::println);

        //or
        list.stream().distinct().forEach(str-> System.out.println(str));

        //or
        List<String> disList = list.stream().distinct().collect(Collectors.toList());
        System.out.println(disList);


    }
}
