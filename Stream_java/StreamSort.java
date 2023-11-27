package Stream_java;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamSort {
    /*
     * 
     * Sorted()
     * 
     * anyMatch()
     * allMatch()
     * noneMatch()
     * 
     * findAny()
     * findFirst()
     * 
     * concatenation of stream
     */

     public static void main(String[] args) {
        
        //sorted()
        List<Integer> arr = Arrays.asList(3,6,2,1,6,92,4,11,4);

        List<Integer> sortedList = arr.stream().sorted().collect(Collectors.toList());

        List<Integer> reverseSorted = arr.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        System.out.println(sortedList);
        System.out.println(reverseSorted);

        //anyMatch()

        List<String> names = Arrays.asList("vivek","vivek","shreya","aman","naman","salman","vivek","aman");

        boolean isthere = names.stream().anyMatch(name->name.startsWith("v"));
        System.out.println("is there any name starts with v:"+isthere);
        
        //allMatch()
        List<String> names1 = Arrays.asList("vivek","vivek","vinod","vinayak");
        boolean allMatches = names1.stream().allMatch(name->name.startsWith("v"));
        System.out.println("all name starts with v:"+allMatches);

        //noneMatch()
        boolean match = names1.stream().noneMatch(name->name.startsWith("x"));
        System.out.println("no name starts with x:"+match);

        List noElement = Arrays.asList();
        //findAny()
        //give any element from collection and if none is there returns any empty optional object
        // if we try to print empty optional object get exception NoSuchElementFound
        Optional<String> any = names.stream().findAny();
        System.out.println(any.get());

        try{
            Optional any1 = noElement.stream().findAny();
            System.out.println(any1.get());
        }
        catch (Exception e){
            System.out.println("no element found");
        }

        //findFirst
        Optional<String> any2 = names.stream().findFirst();
        System.out.println(any2.get());//describe first

        Optional op = noElement.stream().findFirst();
        System.out.println(op);//empty object

        //concatenate two streams

        List<String> animals = Arrays.asList("dog","cat","cow","elephant");
        List<String> birds = Arrays.asList("sparrow","crow","parrot");

        Stream<String> animal_Stream = animals.stream();
        Stream<String> bird_Stream = birds.stream();
        
        Stream<String> concatStream = Stream.concat(animal_Stream, bird_Stream);
        List<String> concatList = concatStream.collect(Collectors.toList());
        System.out.println(concatList);
        

     }
}
