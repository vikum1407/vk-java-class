package CollectionClzRoom;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayConvertToArrayList {

    public static void main(String[] args) {

        System.out.println("Array Printing: ");
        String[] arr = {"Java","C","C#","C++"};
        for (String value:arr){
            System.out.println(value);
        }

        System.out.println("    ******************         ");

        // Convert an Array to ArrayList

        System.out.println("After Converting Array to ArrayList: ");
        ArrayList als = new ArrayList(Arrays.asList(arr));
        System.out.println(als);

    }
}
