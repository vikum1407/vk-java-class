package JavaQuestions;

public class FindCountFromUpperAndLowerLetters {

    public static void main(String[] args) {

        String str = "WelcoMe VikuM";
        String upper="";
        String lower="";

        for (int i=0; i<str.length();i++){
            char ch = str.charAt(i);
            if (ch>='A' && ch<='Z'){
                upper=upper+ch;
            }else {
                lower=lower+ch;
            }
        }

        System.out.println("Upper Letters: "+upper);
        System.out.println("Lower Letters: "+lower);
    }
}
