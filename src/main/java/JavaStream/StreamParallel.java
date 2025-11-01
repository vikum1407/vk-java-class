package JavaStream;

import java.util.Arrays;
import java.util.List;

class Subjects
{
    String name;
    int score;

    Subjects(String name, int score)
    {
        this.name = name;
        this.score = score;
    }

    public String getName(){
        return this.name;
    }

    public int getScore(){
        return this.score;
    }
}
public class StreamParallel {
    public static void main(String[] args) {

        List<Subjects> list = Arrays.asList(
                new Subjects("Amila", 35),
                new Subjects("Chamara", 45),
                new Subjects("Nandana", 61),
                new Subjects("Gaya", 73),
                new Subjects("Vijith", 75)
        );

        /**
         * using normal stream: sequential
         */
        list.stream().filter(s->s.getScore()>=60).limit(2).forEach(std-> System.out.println(std.getName()+" "+std.getScore()));

        /**
         * using parallel stream:
         */
        list.parallelStream().filter(s->s.getScore()>=60).limit(2).forEach(std-> System.out.println(std.getName()+" "+std.getScore()));

        /**
         * convert normal stream to parallel stream
         */
        list.stream().parallel().filter(s->s.getScore()>=60).limit(2).forEach(std-> System.out.println(std.getName()+" "+std.getScore()));
    }
}
