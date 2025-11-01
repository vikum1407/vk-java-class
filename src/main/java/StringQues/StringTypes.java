package StringQues;

public class StringTypes {
    public static void main(String[] args) {

/*        Differences between String, String Buffer and String Builder -

        String:-
                * String is immutable [String following the string literal concept]
                * String is slow and consumes more memory, because when we concatenate too many strings every time it's create new instance
                * You can compare two string using equal() method. because string class override by object class
                * String using consent pool

        String Buffer:-
                * mutable
                * Synchronized
                * Faster than String but not the String Builder
                * Thread safe
                * String buffer is fast and very less memory consumption
                * can't use equal method
                * string buffer uses memory heap

        String Builder:-
                * mutable
                * Not Synchronized
                * Not thread safe
                * Faster than String and String Buffer

         * String BUFFER AND STRING BUILDER is manipulation of the String main class
         * They provide append(), insert(), delete() and substring() methods for string manipulation
*/

        String str = "vikum";
        //str = str.concat(" vijayantha");
        //StringBuilder str = new StringBuilder("vikum");
        //StringBuffer str = new StringBuffer("vikum ");
        //str.append("vijayantha");
        System.out.println(str);

        //We can use string as mutable when value assign to the reference

        System.out.println("String use as mutable:-");

        String st = "vikum";
        st = st.concat(" bombuwala");
        System.out.println(st);
    }
}
