package LambdaExpressions;


/**
 * If there are arguments and return value
 */
@FunctionalInterface
interface Mechanic{
    public String parts(String pName, int price);
}

/**
 * Normal way of calling interface and it's abstract class

class Volvo implements Mechanic{
    public String parts(String pName, int price){
        System.out.println("Volvo "+ pName+"vehicle parts "+price);

        return ("Volvo 35000Kr");
    }
}
 */

public class Vehicle {
    public static void main(String[] args) {

        /**
         * Normal way of interface and abstract method calling

        Mechanic mechanic = new Volvo();
        System.out.println(mechanic.parts("scdsd ",4500));
         */

        Mechanic mechanic = (pName, price) -> {System.out.println("Volvo "+ pName+"vehicle parts "+price);
            return ("Volvo 35000Kr");
        };
        System.out.println(mechanic.parts("scdsd ",4500));
    }
}
