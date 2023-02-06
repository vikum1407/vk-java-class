package InterfacePractics;

interface B{
    int c=10; //by default variables are static or final, no need to mention

    void m1(); // this a abstract class and by default it's public
}

interface C {
    int s=34; // this is default static or final

    void k1(); //default public and abstract
}

 class zig implements B,C{
    void zipMethod(){
        System.out.println("zig method");
    }

     public void m1(){ //should public, interface method inplements in class level
         System.out.println("parent interface");
         System.out.println(B.c);
     }

     public void k1(){
         System.out.println("child interface");
     }
}

public class day8 extends zig {

    public static void main(String[] args) {

        C dc = new day8();
        dc.k1();

        zig z = new day8();
        z.zipMethod();


    }
}
