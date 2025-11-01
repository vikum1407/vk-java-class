package LambdaExpressions.FunctionInterface;

import java.util.function.Function;

public class FunctionDemo1 {

    /**
     * Function is a predefine one of functional interface in lambda
     * There is only one method call 'apply()'
     * It has only one parameter in any type
     * It can return only one parameter in any type
     */

    public static void main(String[] args) {

        //Argument and return
        Function<Integer, Integer> function = n ->(n*n);

        System.out.println(function.apply(5));

        /**
         * Ex 02 - I want to find string length
         */
        Function<String, Integer> function1 = str ->(str.length());
        System.out.println("Length of String: "+function1.apply("welcome"));


    }
}
