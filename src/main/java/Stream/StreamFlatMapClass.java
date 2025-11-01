package Stream;

import java.util.Arrays;
import java.util.List;

class Grade{
    int stdID;
    String name;
    int marks;

    Grade(int stdID, String name, int marks){
        this.stdID = stdID;
        this.name = name;
        this.marks = marks;
    }
}
public class StreamFlatMapClass {
    public static void main(String[] args) {

        List<Grade> gradeList1 = Arrays.asList(
                new Grade(100, "Pasindu", 89),
                new Grade(101, "Namal", 78),
                new Grade(102, "Uthpala", 61),
                new Grade(103, "Lahiru", 90),
                new Grade(104, "Malith", 82)
        );
        List<Grade> gradeList2 = Arrays.asList(
                new Grade(100, "Haritha", 79),
                new Grade(101, "Chandima", 72),
                new Grade(102, "Sumana", 54),
                new Grade(103, "Weekrama", 43),
                new Grade(104, "Some", 79)
        );
        List<Grade> gradeList3 = Arrays.asList(
                new Grade(100, "Nandana", 78),
                new Grade(101, "Kanishaka", 74),
                new Grade(102, "Kasun", 65),
                new Grade(103, "Gayan", 86),
                new Grade(104, "Asanka", 52)
        );

        List<List<Grade>> finalGrade = Arrays.asList(gradeList1, gradeList2, gradeList3);

        /**
         * without stream
         *      for (List<Grade> std: finalGrade){
         *             for (Grade grade: std){
         *                 System.out.println(grade.name+" "+grade.marks);
         *             }
         *         }
         */

        finalGrade.stream().flatMap(fm->fm.stream()).forEach(m-> System.out.println(m.name+" "+m.marks));

    }
}
