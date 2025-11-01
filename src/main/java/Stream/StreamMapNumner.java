package Stream;

import java.util.Arrays;
import java.util.List;

public class StreamMapNumner {
    public static void main(String[] args) {

        List<Integer> intList = Arrays.asList(34,54,67,97,32);

        intList.stream().map(m-> m*3).forEach(System.out::println);
    }
}
