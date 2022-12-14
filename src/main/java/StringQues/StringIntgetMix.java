package StringQues;

import Practics.practisePlace;

public class StringIntgetMix {

    public String reverseString(String [] str){

        String tmp="";

        for (int z=0; z< str.length; z++){
            String word=str[z];
            if (!this.isParsable(word)){
                for (int i=word.length()-1; i>=0; i--){
                    tmp=tmp+word.charAt(i);
                }
            }else {
                tmp=tmp+word;
            }

        }


        return tmp;
    }

    public String reverseStringV2(String str){

        String word ="";
        String reverseWord = "";
        for(int i=0;i<str.length();i++){
            String letter=""+str.charAt(i);
            if(this.isParsable(letter)){
                for(int j=word.length()-1;j>=0;j--){
                    reverseWord=reverseWord+word.charAt(j);
                }
                word="";
                reverseWord=reverseWord+ letter;
            }else{
                word = word + letter;
            }
        }
        return reverseWord;
    }


    public static boolean isParsable(String input) {
        try {
            Integer.parseInt(input); //check string int
            return true;
        } catch (final NumberFormatException e) {
            return false;
        }
    }

    public static void main(String[] args) {



        StringIntgetMix pt = new StringIntgetMix();

        String str = "test12vikum91sugathadasa89";

        String[] tokens = str.split("(?<=\\d)(?=\\D)|(?=\\d)(?<=\\D)");

        System.out.println(pt.reverseStringV2(str));

        // System.out.println(Arrays.toString(tokens));



    }
}
