package LambdaExpressions.FunctionInterface;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

class Employee{

    String empName;
    int salary;

    Employee(String empName, int salary){
        this.empName = empName;
        this.salary = salary;
    }
}
public class FunctionDemo2 {
    public static void main(String[] args) {

        Function<Employee, Integer> function = e -> {
                int sal = e.salary;

                if (sal>50000 && sal<75000){
                    return (sal*10/100);
                }else if (sal>75000 && sal<100000){
                    return (sal*25/100);
                }else{
                    return (sal*40/100);
                }
        };

        List<Employee> list = new ArrayList<Employee>();
        list.add(new Employee("Tiku",45000));
        list.add(new Employee("Piku",55000));
        list.add(new Employee("Siku",120000));

        Predicate<Integer> b=p->(p>10000);

        for (Employee emp:list){
            int bonus = function.apply(emp);
            if (b.test(bonus)){
                System.out.println(emp.empName+" Bonus: "+function.apply(emp));
            }

        }
    }
}
