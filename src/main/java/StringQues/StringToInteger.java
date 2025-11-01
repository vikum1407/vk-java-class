package StringQues;

public class StringToInteger {
    public static void main(String[] args) {
        String a = "100a";

        /**
         * Can I convert this string to integer
         */
        Integer no = Integer.parseInt(a);

        System.out.println(no);

        /**
         * There is a exception as follows,
         *      at java.lang.NumberFormatException.forInputString
         *
         *  So we can't do this
         */
    }
}
