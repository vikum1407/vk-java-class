package Stream;



import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StreamFlatMapString {
    public static void main(String[] args) {

        List<String> name1 = Arrays.asList("Chamara", "Amila", "Haritha");
        List<String> name2 = Arrays.asList("Chathuranga", "Nishan", "Namal");
        List<String> name3 = Arrays.asList("Nandana", "Kanishaka", "Gayan");

        List<List<String>> grade11 = new ArrayList<>();
        grade11.add(name1);
        grade11.add(name2);
        grade11.add(name3);

        //or
        //List<List<String>> finalList = Arrays.asList(name1, name2, name3);
        grade11.stream().flatMap(fm->fm.stream()).forEach(System.out::println);
    }
}
