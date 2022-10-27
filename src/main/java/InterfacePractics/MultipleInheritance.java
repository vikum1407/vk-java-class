package InterfacePractics;

    /*
    * Multiple Inheritance:-
    *   - Multiple inheritance doesn't support for class(child one clz) to class(multi parent clzes) but to "Extend" can't act(not supported as
    *     extends I1, I2, I3 like that
    *   - instead of classes Multiple interfaces can do that with "Implement" keyword
    *
    *
    * */

interface ABC{
    int x=100;
    void m1();
}

interface XYZ{
    int y=200;
    void m2();
}

public class MultipleInheritance implements ABC,XYZ{
    @Override
    public void m1() {
        System.out.println(x);
    }

    @Override
    public void m2() {
        System.out.println(y);

    }

    public static void main(String[] args) {

        XYZ xy = new MultipleInheritance();
        xy.m2();

        ABC ab = new MultipleInheritance();
        ab.m1();

    }
}
