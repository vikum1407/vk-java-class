package Practics;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.text.CollationElementIterator;
import java.util.*;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

class Employee{
    String name;
    int experience;
    int salary;

    Employee(String name, int experience, int salary){
        this.name = name;
        this.experience = experience;
        this.salary = salary;
    }
}

public class practisePlace{


    public static void main(String[] args) {

        Function<Employee, Integer> function = n->{
            int sal = n.salary;

            if (sal>3000 && sal < 40000){
                return (sal*10/100);
            } else if (sal>4000 && sal < 45000) {
                return (sal*30/100);
            } else if (sal>45000 && sal < 500000) {
                return (sal*40/100);
            }else {
                return (sal*50/100);
            }
        };

        List<Employee> list = Arrays.asList(
          new Employee("viku", 4, 45000), new Employee("piku", 7, 55000)
        );

        for (Employee emp:list){
            System.out.println("Name: "+emp.name + " discount: "+function.apply(emp));
        }

    }
}





