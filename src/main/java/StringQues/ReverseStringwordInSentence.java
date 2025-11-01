package StringQues;

public class ReverseStringwordInSentence {
    public static void main(String[] args) {

        String str = "Hello Java Programming";

        /**
         * get the sentence to the string array
         */
        String[] words = str.split(" ");
        String revSentence = "";

        //outer loop ["Hello","Java","Programming"]
        for (int i=0; i<words.length; i++){
            String word = words[i];
            //System.out.println(word);
            String revWord="";

            for (int j=word.length()-1; j>=0; j--){
                revWord = revWord + word.charAt(j);
            }
            //System.out.println(revWord);
            revSentence = revSentence + revWord + " ";
        }
        System.out.println(revSentence);
    }
}
