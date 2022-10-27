package InterfacePractics;

    /* Interface Importants :-
    *   -  All variable should be Final or Static. no need to mention
    *   -  All method should Abstract. it means no implementations
    *   -  All method by default Public
    *   -  Implementation Rules:
    *           - class can implement interface using "Implements" keyword
    *           - interface can extend another interface using "Extends" keyword
    *           - interface can't extends class
    * */

    interface A{
        int a=10; //By default in interface variable is Final or Static(no need to specify)

        void M1(); //Abstract method, by default it is public
    }


public class Test implements A{
    @Override
    public void M1() {      //when develop(override) the method it's should be Public
        System.out.println(a);
    }
    public static void main(String[] args) {
    /*    Test t = new Test();
        t.M1();
     */
        A abc = new Test();
        abc.M1();

    }


}
