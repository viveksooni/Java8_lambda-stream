package Stream_java;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsFlatMap {
    

    //flat map handle multiple collections
    public static void main(String[] args) {
        
        List<Integer> list1 = Arrays.asList(1,2);
        List<Integer> list2 = Arrays.asList(3,4);
        List<Integer> list3 = Arrays.asList(5,6);

        List<List<Integer>> finalList = Arrays.asList(list1,list2,list3);
        
        System.out.println(finalList);

        List<Integer> finalresult = finalList.stream().flatMap(list -> list.stream()).collect(Collectors.toList());//flat return stream

        System.out.println(finalresult);
        
        //now add 10 in every list of finalList 
        
        finalresult = finalList.stream().flatMap(list->list.stream().map(n->n+10)).collect(Collectors.toList());
        System.out.println(finalresult);


        List<String> team1 = Arrays.asList(  "Alice", "Bob", "Charlie");
        List<String> team2 = Arrays.asList(  "Alice", "Bob", "Charlie", "David", "Eve");
        List<String> team3 = Arrays.asList(  "Grace", "Heidi", "Ivan", "Judy");

        List<List<String>> listOfTeams = Arrays.asList(team1,team2,team3);

        System.out.println(listOfTeams);

        listOfTeams.stream().flatMap(team->team.stream()).forEach(System.out::println);

        List<String> names = listOfTeams.stream().flatMap(team->team.stream()).collect(Collectors.toList());
        System.out.println(names);

        
    }

}
