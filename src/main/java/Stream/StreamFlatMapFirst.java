package Stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamFlatMapFirst {
    public static void main(String[] args) {

        /**
         * Map
         */
        List<Integer> mapList = Arrays.asList(23,43,54,6,51,22,1);
        mapList.stream().map(m->m+10).forEach(System.out::println);

        /**
         * Flatmap
         */
        List<Integer> lst1 = Arrays.asList(54,53);
        List<Integer> lst2 = Arrays.asList(23,29);
        List<Integer> lst3 = Arrays.asList(39,34);

        List<List<Integer>> finalList = Arrays.asList(lst1, lst2, lst3);

        // This is only for print the collection
        List<Integer> resultList = finalList
                .stream()
                .flatMap(fm-> fm.stream()).collect(Collectors.toList());

        System.out.println(resultList);

        //If you need to do some operation on it
        finalList.stream().flatMap(fm -> fm.stream().map(m-> m+5)).forEach(System.out::println);
    }
}
