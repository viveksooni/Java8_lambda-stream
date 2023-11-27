package Stream_java;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsTerminal {
    
     /*
         * In Stream we have 2 type of methods
         * 1) Non terminal methods / proccessing method
         * like : fliter, map, flatmap, limit, distinct
         * 2) terminal methods
         * like : collect, max, min, foreach, count, toArray
         * 
         * non-terminal methods will return Stream of objects
         * then we can apply terminal opertion on stream object 
         */
    public static void main(String[] args) {
        
       //non terminal : distinct() , limit()

       List<String> names = Arrays.asList("vivek","vivek","shreya","aman","naman","salman","vivek","aman");

       //if we want distin collection elements then
    //    we can use distinct()
        
        names.stream().distinct().forEach(System.out::println);

        List<String> distinctList = names.stream().distinct().collect(Collectors.toList());

        System.out.println(distinctList);

    
        // count() terminal operation returns long

         long c = names.stream().distinct().count();
         System.out.println(c);

         //Limit() non-terminal
         List<String> limited_Names = names.stream().limit(3).collect(Collectors.toList());
         System.out.println(limited_Names);   


         //how many even numbers in list
         List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9);

         long county = numbers.stream().filter(n->n%2==0).count();
         System.out.println(county);
    }
}
