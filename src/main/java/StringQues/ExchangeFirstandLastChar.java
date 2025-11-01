package StringQues;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ExchangeFirstandLastChar {
    public static void main(String[] args) {

        String str = "james";

        /**
         * Exchange first and last characters without changing middle characters
         */

        char firstchar = str.charAt(0);
        char lastchar = str.charAt(str.length()-1);
        String midString = str.substring(1,str.length()-1);

//        System.out.println(firstchar);
//        System.out.println(lastchar);
//        System.out.println(midString);

        String result = lastchar+midString+firstchar;
        System.out.println("Result: "+result);

        /**
         * Exchange first and last characters without changing middle characters
         */

        /**
         * reverse the middle characters
         */
        String reverseMid="";
        for (int i=midString.length()-1; i>=0; i--){
            reverseMid=reverseMid+midString.charAt(i);
        }
        //System.out.println(reverseMid);

        String reresult = lastchar+reverseMid+firstchar;
        System.out.println(reresult);

        /**
         * this is another way. try this way as well.
         */
        String str5 = "bombuwala";

        StringBuilder sb = new StringBuilder(str5);
        System.out.println(sb.reverse());

    }
}
