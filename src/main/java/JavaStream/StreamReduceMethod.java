package JavaStream;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamReduceMethod {
    public static void main(String[] args) {

        List<String> stringList = Arrays.asList("A","B","C","1","2","3");

        Optional<String> reduceVal = stringList.stream().reduce((val, combineVal)->{
            return val+combineVal;
        });

        System.out.println(reduceVal.get()); //ABC123
    }
}
