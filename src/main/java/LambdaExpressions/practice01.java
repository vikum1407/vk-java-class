package LambdaExpressions;

import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

class Employ{

    String name;
    int salary;
    Employ(String name, int salary){
        this.name = name;
        this.salary = salary;
    }
}
public class practice01 {

    public static void main(String[] args) {

        ArrayList<Employ> empList = new ArrayList<>();
        empList.add(new Employ("viku", 45000));
        empList.add(new Employ("tiku", 35000));
        empList.add(new Employ("siku", 25000));
        empList.add(new Employ("piku", 15000));

        Function<Employ, Integer> salFun = f-> {
            int sal = f.salary;
            if (sal > 25000 && sal<35000){
                return (sal*10/100);
            } else if (sal>35000 && sal<45000) {
                return (sal*25/100);
            }else {
                return (sal*30/100);
            }
        };

        Predicate<Integer> predFun = p-> p>5000;

        Consumer<Employ> conFun = c-> System.out.println(c);


        for (Employ emp : empList){
            int bouns = salFun.apply(emp);
            if (predFun.test(bouns)){
                 conFun.accept(emp);
            }
        }

    }
}
