package LambdaExpressions.ComsumerInterface;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

class Employee<T>
{
    String empName;
    int empSalary;

    Employee(String name, int salary){
        empName  = name;
        empSalary = salary;
    }
}

public class CombinationPrediFuncConsu {

    public static void main(String[] args) {

        List<Employee> list = new ArrayList<Employee>();
        list.add(new Employee("Tiku",45000));
        list.add(new Employee("Siku", 65000));
        list.add(new Employee("Niku", 75000));

        Function<Employee, Integer> function = f-> (f.empSalary*10)/100;

        Predicate<Integer> p= n->n>5000;

        Consumer<Employee> con=e->{
            System.out.println("Employee Name: "+e.empName);
        };

        for (Employee emp:list){
           int bonus =  function.apply(emp);
           if (p.test(bonus)){
               con.accept(emp);
           }
        }

    }
}
