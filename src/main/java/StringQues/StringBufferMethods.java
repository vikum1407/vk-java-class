package StringQues;

public class StringBufferMethods {
    public static void main(String[] args) {

        // 01. Appen() method
        StringBuffer sb = new StringBuffer("Hello ");
        sb.append("Vikum");
        System.out.println("After Appen: "+sb);

        // 02. insert() method
        StringBuffer sb1 = new StringBuffer("Hello ");
        sb1.insert(3,"Vikum");
        System.out.println("After insertion: "+sb1);

        // 03. replace() method
        StringBuffer sb2 = new StringBuffer("Hello ");
        sb2.replace(1,3,"Vikum");
        System.out.println("After replacement: "+sb2);

        // 04. delete() method
        StringBuffer sb3 = new StringBuffer("Hello ");
        sb3.delete(1,3);
        System.out.println("After deletion: "+sb3);

        // 05. reverse() method
        StringBuffer sb4 = new StringBuffer("Hello ");
        sb4.reverse();
        System.out.println("After reverse: "+sb4);
    }
}
