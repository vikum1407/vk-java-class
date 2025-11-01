package LambdaExpressions.DeleteLamda;

@FunctionalInterface
interface SFI{
    public String svenska(String name, String address);
}

public class secondPracClz {
    public static void main(String[] args) {

//        SFI sfi = (a, b) -> System.out.println("Result: "+a+" "+b);
//        sfi.Svenska("vikum", "bombuwala");

        SFI sfi = (a, b) -> {
            return (a + " "+ b);
        };
        System.out.println(sfi.svenska("pavi", "Kuliyapitiya"));


    }
}
