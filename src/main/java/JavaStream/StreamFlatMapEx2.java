package JavaStream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamFlatMapEx2 {
    public static void main(String[] args) {

        List<String> teamA = Arrays.asList("Amila","Dinushan","Lakshitha","Haritha");
        List<String> teamB = Arrays.asList("Namal","Nishan","Lakshitha","Ishan");
        List<String> teamC = Arrays.asList("Vikum","Kanishka","Nandana","Gayanath");

        List<List<String>> teams = Arrays.asList(teamA,teamB,teamC);

        /**
         * without flatmap()
         */
        for (List<String> team: teams){
            for (String tm:team){
                System.out.println(" "+tm);
            }
        }
        System.out.println();

        /**
         * using flatmap
         */
        List<String> listNames = teams.stream().flatMap(flat->flat.stream()).collect(Collectors.toList());
        System.out.println(listNames);

    }
}
