package JavaStream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamFilterMethod {
    public static void main(String[] args) {

        List<Integer> arrayList = Arrays.asList(10,34,32,54,23,33);
        List<Integer> evenList = new ArrayList<Integer>();

        /**
         * Without stream method using


        for (int no:arrayList){
            if (no%2==0){
                evenList.add(no);
            }
        }

        System.out.println(evenList);
         */

        /**
         * With stream, lambda using
         */

        evenList = arrayList.stream().filter(n->n%2==0).collect(Collectors.toList());
        System.out.println(evenList);

        /**
         * If you don't want to save filtered no in a new array, you can do as follows
         */
        arrayList.stream().filter(n->n%2==0).forEach(n-> System.out.println(n));

        //or
        arrayList.stream().filter(n->n%2==0).forEach(System.out::println);
    }
}
