package LambdaExpressions.PredicateInterface;

import java.util.function.Predicate;

public class CombineMultiPredicates {

    /**
     * The task is to combine two predicates:
     *  Eg: There is an integer array with multiple int elements
     *          1. Need to check even numbers
     *          2. Need to check greater than 50 numbers
     *
     *     * For this multiple predicates combining we can use following things:
     *                  and, or and negate(posit result)
     *
     *
     * @param args
     */
    public static void main(String[] args) {

        int a[] = {34,65,76,87,34,11,49,40,52};

        Predicate<Integer> predicate = n->(n%2==0);
        Predicate<Integer> predicate1 = n->(n>50);

        for (int e:a){
            if (predicate.and(predicate1).test(e)){
                System.out.println("Value: "+e);
            }

            /**
             *  if (predicate.or(predicate1).test(e)){
             *         System.out.println("OR function in predicate");
             *  }
             *
             *  if (predicate.negate().test(e)){
             *          System.out.println("Negate function in predicate");
             *  }
             */

        }

    }
}
