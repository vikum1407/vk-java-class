package Stream;

import java.util.Arrays;
import java.util.List;

class Employe{
    int empNo;
    String name;
    double salary;

    Employe(int empNo, String name, double salary){
        this.empNo = empNo;
        this.name = name;
        this.salary = salary;
    }

}
public class StreamMapObjects {
    public static void main(String[] args) {

        List<Employe> empList = Arrays.asList(
                new Employe(1000, "Malith", 34000),
                new Employe(1000, "Uthpala", 45000),
                new Employe(1000, "Lahiru", 42000),
                new Employe(1000, "Vikum", 55000),
                new Employe(1000, "Namal", 23000)
        );

        /**
         * Map and Filter combination
         */

        empList.stream()
                .filter(f-> f.salary>40000)
                .map(m-> m.salary)
                .forEach(System.out::println);
    }
}
