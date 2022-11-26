package StringQues;

public class byteArrayToString {
    public static void main(String[] args) {


        byte[] byte_arr = {71, 101, 101, 107, 115};
        String s_byte = new String(byte_arr);
        System.out.println(s_byte);

        byte[] byte_arr1 = {71, 101, 101, 107, 115};
        String s_byte1 = new String(byte_arr,0,2);
        System.out.println(s_byte1);
    }
}
