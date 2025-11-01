package JavaStream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamConcat {
    public static void main(String[] args) {

        List<String> clz1 = Arrays.asList("Amila","Haritha","Lakshitha","Chamara");
        List<String> clz2 = Arrays.asList("Kasun","Pasindu","Sajith","Ranga");

        Stream<String> stream1 = clz1.stream();
        Stream<String> stream2 = clz2.stream();

        List<String> list = Stream.concat(stream1, stream2).collect(Collectors.toList());

        for (String str: list){
            System.out.print(" "+str);
        }
    }
}
