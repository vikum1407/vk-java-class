package JavaStream;

import java.util.Arrays;
import java.util.List;

public class StreamToArray {
    public static void main(String[] args) {

        List<String> stringList = Arrays.asList("A","B","C","1","2","3");

        Object arr[] = stringList.stream().toArray();
        for (Object str: arr){
            System.out.print(" "+str);
        }
    }
}
