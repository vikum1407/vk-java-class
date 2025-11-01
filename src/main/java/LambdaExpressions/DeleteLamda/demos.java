package LambdaExpressions.DeleteLamda;

@FunctionalInterface
interface Cab{
    public void bookCab(String source, String destination);
}

public class demos {
    public static void main(String[] args) {

        Cab cab = (source, destination) -> System.out.println("Source: " +source+" "+"Destination: "+ destination);
        cab.bookCab("Cangaroo", "Kalutara");

        /**
         * if there is a return statement
         */

    }
}
