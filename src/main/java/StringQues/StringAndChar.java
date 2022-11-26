package StringQues;

public class StringAndChar {
    public static void main(String[] args) {

    /* **********Difference between char and string**********
        Char:-

                * char is a primitive data type
                * char is represent a single character whereas string represent zero or more characters. So string is array of chars
                * char define with '' quotation

        String:-

                * string is a class
                * string represent zero or more characters. So string is array of chars
                * string define "" quotation

     */

        //Convert char in to String
        char ch = 'V';
        String str = String.valueOf(ch);
        System.out.println(str);

        String str1 = Character.toString(ch);
        System.out.println(str1);

    }
}
