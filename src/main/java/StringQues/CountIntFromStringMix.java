package StringQues;

public class CountIntFromStringMix {

    public static void digits(String str){

        char[] ch = str.toCharArray();
        StringBuilder sb = new StringBuilder();
        for (char chars:ch){
            if (Character.isDigit(chars)){
                sb.append(chars);
            }
        }
        System.out.println(sb);
        System.out.println(sb.length());
    }

    public static void main(String[] args) {

        String str = "vi12ik456m su34ga vi67";
        digits(str);
    }
}
