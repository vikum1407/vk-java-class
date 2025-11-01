package CollectionClzRoom;

public class FindVowelsInString {

    public static int vowelsMethod(String str){
        int count=0;

        System.out.println("Characters: ");
        for (int i=0; i<str.length(); i++){
            if (str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u'){
                System.out.println(str.charAt(i));
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        String str = "Welcome";
        System.out.println("Characters Count: "+vowelsMethod(str));
    }
}
