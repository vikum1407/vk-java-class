package LambdaExpressions;


@FunctionalInterface
interface Cab{
    public void bookCab();
}

/**
 * Without using Lambda -> *********

class Ola implements Cab{

    public void bookCab(){
        System.out.println("Can Method Development");
    }
}
 */

public class WhyLambda {

    public static void main(String[] args) {

        /**
         * Why Lambda: -
         *
         * Java having 'class' and 'objects' but lamda having 'function' and 'variable'.
         *          1. To bring the function programming feature in java
         *          2. Code optimization
         *
         * What is Lambda Function:-
         *          1. Lambda is an anonymize function (Anonymize mean it doesn't have 'Name of the method', 'Return type',
         *          and 'Access modifiers'
         *
         * How to call a Lambda function:
         *          - Through a functional interface - Functional Interface mean only contain one(single abstract method (SAM).
         *          - But that interface can have,
         *                  - Any amount of 'default methods'
         *                  - Any amount of 'static methods'.
         */



        /**
         * without using Lambda **********

        Cab cab = new Ola();
        cab.bookCab();
         */

        Cab cab = ()-> System.out.println("Can Method Development using Lambda");
        cab.bookCab();

    }
}
