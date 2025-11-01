package LambdaExpressions.Supplier;

import java.util.Date;
import java.util.function.Supplier;

public class SuppilerDemo1 {

    /**
     * Method: get()
     *  * It doesn't take any argument but return a value
     */
    public static void main(String[] args) {

        Supplier supplier = ()-> new Date();

        System.out.println(supplier.get());
    }
}
