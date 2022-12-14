package StringQues;

public class StringPermutations {
    public static void permitation(String str,String str2){

        // check if string is empty or null
        if (str.length() == 0)
        {
            System.out.print(str2 + " ");
            return;
        }

        for (int i = 0; i < str.length(); i++)
        {
            // ith character of str
            char ch = str.charAt(i);
            // Rest of the string after excluding
            // the ith character
            String str3 = str.substring(0, i) + str.substring(i + 1);
            // Recursive call
            permitation(str3, str2 + ch);
        }
    }
    // Driver code
    public static void main(String[] args) {

        String s = "cat";
        permitation(s,"");

    }
}
