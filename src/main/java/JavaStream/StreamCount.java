package JavaStream;

import java.util.Arrays;
import java.util.List;

public class StreamCount {
    public static void main(String[] args) {

        List<String> list = Arrays.asList("bus","car","lorry","bus","van","lorry","car");

        long count = list.stream().count();
        System.out.println(count);

        List<Integer> noList = Arrays.asList(32,43,45,66,51,11,23,54,67);

        long noCount = noList.stream().filter(n->n%2==0).count();
        System.out.println("Even Nos: "+noCount);

    }
}
