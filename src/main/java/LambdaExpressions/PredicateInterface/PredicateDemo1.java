package LambdaExpressions.PredicateInterface;

import java.util.function.Predicate;

/**
 *
 *      java package:- java.util.function
 *
 * interface Predicate(T)
 * {
 *     public abstract boolean test(T t);
 * }
 */

public class PredicateDemo1 {
    public static void main(String[] args) {

        /**
         * Ex 01
         */
        Predicate<Integer> predicate = i->(i>10);
        System.out.println(predicate.test(20)); //true
        System.out.println(predicate.test(5)); //false

        /**
         * Ex 02 - check the length of given string greater than 4 or not
         */
        Predicate<String> predicate1 = s -> (s.length()>4);
        System.out.println(predicate1.test("Welcome"));

        /**
         * Ex 03 - there is a string array and check which element has characters more than 4
         */

        String[] names = {"David","Kavitha","Sukumala","Cha","Kumu"};

        for (String name:names){
            if (predicate1.test(name)==true){
                System.out.println(name+" name is greater than 4!!!");
            }else {
                System.out.println(name+" so sad...");
            }
        }
    }
}
