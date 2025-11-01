package CollectionClzRoom;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class FindDuplicateValueFromString {

    public static void main(String[] args) {

        String str = "Welcomeom";

        int count=0;
        boolean flag = false;

        List<String> list = new ArrayList<>();
        for (int i=0; i<str.length(); i++){
            list.add(String.valueOf(str.charAt(i)));
        }

        HashSet<String> hs = new HashSet<>();
        for (String ch: list){
            if (hs.add(ch)==flag){
                System.out.println(ch);
                count++;
            }
        }

        System.out.println(count);
    }
}
