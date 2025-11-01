package JavaStream;



import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamFlatMap {
    public static void main(String[] args) {

        /**
         * Main Differences between map() and flatmap():-
         *      - If you have complex data processing you have to use flatmap()
         *      - Flatmap return group of objects but map() return single object
         *
         */

        List<Integer> list1 = Arrays.asList(12,32);
        List<Integer> list2 = Arrays.asList(33,11);
        List<Integer> list3 = Arrays.asList(21,23);
        /* If we are going to save above three collections we have to define one big collection*/

        List<List<Integer>> finalList = Arrays.asList(list1, list2, list3);

        List<Integer> finalResults1 = finalList.stream().flatMap(flat -> flat.stream()).collect(Collectors.toList());
        System.out.println(finalResults1);

        /**
         * do some operations to the elements of each list
         */
        List<Integer> finalResult2 = finalList.stream().flatMap(flat -> flat.stream().map(n->n+10)).collect(Collectors.toList());
        System.out.println(finalResult2);
    }
}
