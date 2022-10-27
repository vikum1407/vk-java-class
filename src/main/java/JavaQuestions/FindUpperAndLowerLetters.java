package JavaQuestions;

public class FindUpperAndLowerLetters {
    public static void main(String[] args) {

        String str = "WelcoMe VikuM";
        int lower=0;
        int upper=0;

        for (int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
            if (ch>='A' && ch<='Z'){
                upper++;
            }else {
                lower++;
            }
        }
        System.out.println("Upper Letter Count: "+upper);
        System.out.println("Lower Letter Count: "+lower);
    }
}
