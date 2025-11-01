package JavaStream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamFilterModify {
    public static void main(String[] args) {

        List<String> nameList = Arrays.asList("Pasindu", null, "Malith","Uthpala", null, "Lahiru","Siriwardana");

        List<String> names = nameList.stream().filter(name->name!=null).collect(Collectors.toList());
        System.out.println(names);

    }
}
