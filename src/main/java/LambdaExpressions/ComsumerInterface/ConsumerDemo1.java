package LambdaExpressions.ComsumerInterface;

import java.util.function.Consumer;

public class ConsumerDemo1 {

    /**
     * There is  a argument to pass but no return values
     * Method: accept()
     * @param args
     */
    public static void main(String[] args) {

        Consumer<String> con=s-> System.out.println(s);

        con.accept("Welcome");
    }
}
