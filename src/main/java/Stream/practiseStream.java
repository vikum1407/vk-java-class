package Stream;

import java.util.Arrays;
import java.util.List;

class University{

    int subID;
    String subName;
    String stdName;

    University(int subID, String subName, String stdName){
        this.subID = subID;
        this.subName = subName;
        this.stdName = stdName;
    }

}
public class practiseStream {
    public static void main(String[] args) {

        List<University> uniList = Arrays.asList(
                new University(100, "Chemastry", "Malith"),
                new University(101, "Maths", "Uthpala"),
                new University(102, "Physics", "Namal"),
                new University(100, "Social Science", "Pubudhu"),
                new University(100, "Biology", "Gramani")
        );

        uniList.stream().filter(fn-> fn.stdName=="Malith")
                .map(m->m.subName).forEach(System.out::println);

    }
}
