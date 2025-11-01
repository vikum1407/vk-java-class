package LambdaExpressions;

@FunctionalInterface
interface Government{
    public String Tax(String companyName, String subTitle);
}

public class Practice {
    public static void main(String[] args) {

        Government govern = ((companyName, subTitle) -> {
            System.out.println("My company Name is "+companyName+"Sub is "+subTitle);
            return ("Hello "+companyName);
        });
        govern.Tax("Voleco","Sustainable Development");
    }
}
