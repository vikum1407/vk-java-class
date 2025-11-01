package StringQues;

public class RemoveSpecialCharactors {

    public static void main(String[] args) {

        String str = "Macbook##£$£Pro";

        System.out.println(str.replaceAll("[^0-9,a-z,A-Z]",""));
        str.replaceAll("[^0-9,a-z,A-Z]",""); //^ is meant in java, exclusive of this characters
    }
}



