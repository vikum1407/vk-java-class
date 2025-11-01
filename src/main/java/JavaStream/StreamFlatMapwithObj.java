package JavaStream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Student
{
    int stdID;
    String stdName;
    String grade;

    Student(int id, String name, String grade)
    {
        stdID = id;
        stdName = name;
        this.grade = grade;
    }

}
public class StreamFlatMapwithObj {
    public static void main(String[] args) {

        List<Student> stdList1 = new ArrayList<Student>();
        stdList1.add(new Student(1000, "Amila", "Grade A"));
        stdList1.add(new Student(1001, "Ishan", "Grade B"));
        stdList1.add(new Student(1002, "Vikum", "Grade C"));

        List<Student> stdList2 = new ArrayList<Student>();
        stdList1.add(new Student(1003, "Haritha", "Grade A"));
        stdList1.add(new Student(1004, "Nishan", "Grade B"));
        stdList1.add(new Student(1005, "Nandana", "Grade C"));

        List<Student> stdList3 = new ArrayList<Student>();
        stdList1.add(new Student(1006, "Dinushan", "Grade A"));
        stdList1.add(new Student(1007, "Madushan", "Grade B"));
        stdList1.add(new Student(1008, "Gayanath", "Grade C"));

        List<List<Student>> mainStdList = Arrays.asList(stdList1, stdList2, stdList3);

        List<String> stdl = mainStdList.stream().flatMap(std->std.stream().map(n->n.stdName)).collect(Collectors.toList());
        System.out.println(stdl);


    }
}
