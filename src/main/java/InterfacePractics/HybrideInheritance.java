package InterfacePractics;

class A1{
    void m1(){
        System.out.println("This is m1 method from A1 class");                                       /*Hybride Model:-*/
    }
}                                                                                               /*A1(class)*/
                                                                                                                            /*A1 implements is not possible */
interface P1{
    void m2();                                                                       /*P1(interface)                /*P2(interface)*/
}
                                                        /*keyword is "Implements" */                                /*keyword is "Implements" */
interface P2{                                    /*but keyword is "Extend" for get the details from A1 class to Hybride class */
    void m3();                                                                                  /*HybrideInterface*/
}
public class HybrideInheritance extends A1 implements P1, P2 {      /*here HybrideInterface class must have all feature from A1 calss, P1 and P2 interfaces*/
    @Override
    public void m2() {
        System.out.println("this is m2 from P1 interface");
    }

    @Override
    public void m3() {
        System.out.println("this is m3 from P2 interface");
    }

    public static void main(String[] args) {
        P1 ps = new HybrideInheritance();
        ps.m2();

        P2 pa = new HybrideInheritance();
        pa.m3();

        /* OR */
        System.out.println("-------------------OR-----------------");

        HybrideInheritance abc = new HybrideInheritance();
        abc.m2();
        abc.m1();
        abc.m3();
    }
}
