package LambdaExpressions.PredicateInterface;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

class Employee
{
    String name;
    int salary;
    int experience;

    Employee(String empName, int sal, int exp){
        name = empName;
        salary = sal;
        experience = exp;
    }
}

public class PredicateForObject {
    public static void main(String[] args) {

        Employee emp = new Employee("Vikum",50000, 4);

        /**
         * Take Object as an Argument in Lambda Function:-
         * take the emp as an object and return the empName when salary more than 30000 and exp more than 5 years
         */

        Predicate<Employee> predicate = e -> (e.salary>30000 && e.experience>5);
        System.out.println(predicate.test(emp));

        /**
         * Now I need to pass multiple employee and check the name against salary and experience.
         */
        List<Employee> list = new ArrayList<Employee>();
        list.add(new Employee("Tika",60000,8));
        list.add(new Employee("Pika",40000,4));
        list.add(new Employee("Siku",25000,7));

        for (Employee e:list){
            if (predicate.test(e)){
                System.out.println("Emp Name: "+ e.name);
            }
        }
    }
}
