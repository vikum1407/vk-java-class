package LambdaExpressions;

public class LambdaTheory {

    /**
     * Why Lambda: -
     *          1. To bring the function programming feature in java
     *          2. Code optimization
     *
     * What is Lambda Function:-
     *          1. Lambda is an anonymize function (Anonymize mean it doesn't have 'Name of the method', 'Return type',
     *          and 'Access modifiers'
     *
     * JAVA 7 onward, interface can have Default and Static method as some as the abstract methods.
     *
     * How to call a Lambda function:
     *          - Through a functional interface - Functional Interface mean only contain one Single Abstract Method (SAM).
     *          - But that interface can have,
     *                  - Any amount of 'default methods'
     *                  - Any amount of 'static methods'.
     *
     *          Already available Functional interface in java
     *              - Runnable(interface) - run() /abstract method
     *              - Callable(interface) - call() /abstract method
     *              - Comparable(interface) - compareTo() /abstract method
     *              - ActionListPerform(interface) - actionListPerformed() /abstract method
     */

    /**
     * Lambda Predefine Interfaces:-
     *  Without having functional interface, still you can invoke lambda function through the following predefined
     *  interfaces.
     *
     *  - Predicate(I)
     *      Features:-
     *          * Only contain one abstract method. that method name is 'test()'
     *          * Return only one 'boolean' parameter
     *          * Use only if you want check conditional
     *          * In build methods for joining predicates - and(), or(), negate()
     *  - Function(I)
     *          * Only contain one abstract method. that method name is 'apply()'
     *          * This interface take two arguments those are parameter and return type.
     *          * Return only single value in any data type.
     *          * To chaining the function it has 'andThen()' and 'compose()' methods
     *                  * 'compose()' method will return opposite value of 'andThen()' method.
     *                  eg:-
     *                  System.out.println(f1.andThen(f2).apply(2)); //first f1 executed and then f2
     *                  System.out.println(f1.compose(f2).apply(2)); //first f2 executed and then f1
     *
     *  - Consumer(I)
     *          * Only contain one abstract method. that method name is 'accept()'
     *          * This interface need one parameter but it doesn't return any
     *          * To chaining the function it has 'andThen()' and 'compose()' methods
     *              eg:-
     *                 System.out.println(c1.andThen(c2).accept(c3)); //first f1 executed and then f2
     *                 System.out.println(c1.compose(c2).accept(c3)); //first f2 executed and then f1
     *
     *  - Supplier(I)
     *          * Only contain one abstract method. that method name is 'accept()'
     *          * This doesn't take any input but return some objects, element ...etc

     *
     *  above pre-define interfaces comes under 'java.util.function'
     */
}
