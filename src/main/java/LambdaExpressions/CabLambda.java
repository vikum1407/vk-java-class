package LambdaExpressions;

import javax.swing.*;

/**
 * If the abstract method has arguments
 */

@FunctionalInterface
interface Caab{
    public void bookCab(String source, String distant);
}

/**
 * without using Lambda


class Olaa implements Caab{
    public void bookCab(String source, String distant){
        System.out.println("Source: "+source+"distant: "+ distant);
    }
}
 */
public class CabLambda {
    public static void main(String[] args) {

        /**
         * without using Lambda

        Caab cab = new Olaa();
        cab.bookCab("Vikum","Sugathadasa");
         */

        /**
         * improve 01

        Caab caab = (String source, String distant) -> System.out.println("Source: "+source+"distant: "+ distant);
        caab.bookCab("Vikum ","Sugathadasa");
         */


        /**
         * improve 02: remove data type
         */
        Caab caab = (source, distant) -> System.out.println("Source: "+source+"distant: "+ distant);
        caab.bookCab("Vikum ","Sugathadasa");
    }
}
