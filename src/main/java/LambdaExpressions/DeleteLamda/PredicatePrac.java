package LambdaExpressions.DeleteLamda;

import java.util.ArrayList;
import java.util.function.Predicate;

class Employee{
    String name;
    float salary;
    int experience;

    Employee(String name, float salary, int experience){
        this.name = name;
        this.salary = salary;
        this.experience = experience;
    }
}
public class PredicatePrac {
    public static void main(String[] args) {

        /**
         *
        Predicate<Integer> predicate = t -> (t>10);
        //System.out.println(predicate.test(3));

        Predicate<String> pred = t -> (t.length()>3);
        //System.out.println(pred.test("vikum"));

        String[] names = {"David","Kavitha","Sukumala","Cha","Kumu"};

        Predicate<String> p = nm -> (nm.length()>5 && nm.startsWith("S"));

        for (String vk:names){
            if (p.test(vk)){
                System.out.println(vk);
            }
        }
         */


//        Employee employee1 = new Employee("vikum", 45000, 6);
//        Employee employee2 = new Employee("tiku", 25000, 5);
//        Employee employee3 = new Employee("siku", 30000, 4);

//        ArrayList<Employee> employees = new ArrayList<>();
//        employees.add(new Employee("vikum", 45000, 6));
//        employees.add(new Employee("tiku", 25000, 5));
//        employees.add(new Employee("siku", 30000, 4));
//        Predicate<Employee> prediEmp = emp -> (emp.salary>35000 && emp.experience > 5);

        ArrayList<Employee> empList = new ArrayList<>();
        empList.add(new Employee("vikum", 45000, 6));
        empList.add(new Employee("tiku", 35000, 3));
        empList.add(new Employee("piku", 55000, 8));

        Predicate<Employee> empP1 = employee1 -> (employee1.salary > 40000);
        Predicate<Employee> empP2 = employee2 -> (employee2.experience > 5);

        for (Employee emp : empList){
            if (empP1.negate().test(emp)){
                System.out.println(emp.name);
            }
        }

    }
}
