package LambdaExpressions.FunctionInterface;

import java.util.function.Function;

public class FunctionMethods {

    /**
     *  - andThen()
     *  - compose()
     */
    public static void main(String[] args) {

        Function<Integer, Integer> function=i->(i*2); //4
        Function<Integer, Integer> function1=i->(i*i*i); //4*4*4

        System.out.println(function.andThen(function1).apply(2)); //64
        System.out.println(function.compose(function1).apply(2)); //16 [function1 -> 2*2*2 then function-> 8*2]
    }
}
