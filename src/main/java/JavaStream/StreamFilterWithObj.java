package JavaStream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class Product
{
    String prodName;
    int price;
    int prodLine;

    Product(String name, int price, int line){
        prodName = name;
        this.price = price;
        prodLine = line;
    }
}
public class StreamFilterWithObj {
    public static void main(String[] args) {

        List<Product> prodList = new ArrayList<Product>();
        prodList.add(new Product("BabySoap",45,1));
        prodList.add(new Product("GensSoap",40,2));
        prodList.add(new Product("LadySoap",35,3));
        prodList.add(new Product("Soap",55,4));
        prodList.add(new Product("NotySoap",65,5));

        /**
         * Try to find the soap more than 50 of price
         */

        //Approach 01
        prodList.stream().filter(prod -> prod.price>50).forEach(pro -> System.out.println(pro.price));

    }
}
