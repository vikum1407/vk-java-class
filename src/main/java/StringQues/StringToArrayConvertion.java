package StringQues;

import java.util.Arrays;

public class StringToArrayConvertion {

    public static String convertArrayToString(String[] strArray){
        return Arrays.toString(strArray);
    }

    public static void main(String[] args) {
        String[] str = {"Scaler", "by", "InterviewBit"};
        String str1 = convertArrayToString(str);

        System.out.println("String Array to String: "+str1);
    }
}
