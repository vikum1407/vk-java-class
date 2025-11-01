package LambdaExpressions.DeleteLamda;

import java.util.ArrayList;
import java.util.function.Function;
import java.util.function.Predicate;

class Employe{
    String name;
    int experience;
    int salary;

    Employe(String name, int experience, int salary){
        this.name = name;
        this.experience = experience;
        this.salary=salary;
    }
}

public class FunctionLamda {
    public static void main(String[] args) {

        String[] names = {"David","Kavitha","Sukumala","Cha","Kumu"};

        Function<String, Integer> fun = n->(n.length());

        for (String str:names){
            if (fun.apply(str)>5){
                System.out.println(str);
            }
        }

        ArrayList<Employe> arrayList = new ArrayList<>();
        arrayList.add(new Employe("viku", 7, 45000));
        arrayList.add(new Employe("tiku", 4, 35000));
        arrayList.add(new Employe("piku", 6, 42000));

        Function<Employe, Integer> function = f -> {
            int sal = f.salary;
            if (f.salary > 30000 && f.experience>3)
                return (sal*10/100);
            else if (f.salary > 40000 && f.experience>5)
                return (sal* 50/100);
            else
                return (sal * 20/100);
        };

        Predicate<Integer> predicate = p -> p>4000;

        for (Employe emp:arrayList){
            int bonus = function.apply(emp);
            if (predicate.test(bonus)){
                System.out.println("Name: "+emp.name+ " "+ bonus);
            }
        }
    }
}
