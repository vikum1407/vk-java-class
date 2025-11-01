package JavaStream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Employee
{
    String empId;
    String empName;
    int salary;

    Employee(String id, String name, int sal){
        empId = id;
        empName = name;
        salary = sal;
    }
}
public class StreamBothFilteMapMethods {
    public static void main(String[] args) {

        List<Employee> empList = Arrays.asList(
                new Employee("1000","Sunil",45000),
                new Employee("1001","Kamal",55000),
                new Employee("1002","Viraj",65000),
                new Employee("1003","Sunimal",35000),
                new Employee("1004","Nimalajith",57000)
        );

        /**
         * Stream hierarchy:
         *          Filter() first and Map second()
         *          Collection() -> Stream() -> Filter() -> Map() -> collect
         */

        /**
         * Combination of filter() and map()
         */

        List<Integer> empSalList = empList.stream().filter(emp -> emp.salary>50000)
                .map(e->e.salary).collect(Collectors.toList());

        System.out.println(empSalList);


    }
}
