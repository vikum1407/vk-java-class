package Stream;

import java.util.ArrayList;
import java.util.List;

class Product{

    int id;
    String name;
    double price;

    Product(int id, String name, double price){
        this.id = id;
        this.name = name;
        this.price = price;
    }

}
public class StreamFilterWithClass {
    public static void main(String[] args) {

        List<Product> prodList = new ArrayList<>();
        prodList.add(new Product(100, "Bed", 3400));
        prodList.add(new Product(101, "Table", 2300));
        prodList.add(new Product(102, "Chair", 500));
        prodList.add(new Product(103, "Build", 6600));
        prodList.add(new Product(104, "Soda", 8100));

        /**
         * Filter the object from this collection from the price
         */
        prodList.stream().filter(p-> p.price>3000)
                .forEach(pr -> System.out.println(pr.name+ " "+pr.price));

    }
}
