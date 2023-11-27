package Stream_java;

import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.ArrayList;
import java.util.Arrays;

public class Streams {
    
    public static void main(String... args) {
       
        // we can create a List like this also
      
        List<Integer> list = Arrays.asList(1,2,3,4,5,6);
        
        //get all even in arraylist

        List<Integer> evenNum = new ArrayList<>();

        //normal method without stream

        // for(int a:list)
        // {
        //     if(a%2==0)
        //     {evenNum.add(a);}
        // }
        // System.out.println(evenNum);

        //using stream

        evenNum=list.stream().filter(n->n%2==0).collect(Collectors.toList());//it will store in another collection
        System.out.println(evenNum);

        //but if you don't want to store then 
        list.stream().filter(n->n%2==1).forEach(n->System.out.println(n));//for each take consumer

        list.stream().filter(n->n%2==0).forEach(System.out::println);


        List<String> names = Arrays.asList("Melisandre","Sansa","Jon","Daenerys","Joffery");
        List<String> longNames = new ArrayList<>();
        //print name is its length is more than 4 and less than 8

        names.stream().filter(name->name.length()>6  && name.length()<8).forEach(n->System.out.println(n));
        
        longNames = names.stream().filter(name->name.length()>6 && name.length()<8).collect(Collectors.toList());

        System.out.println(longNames);

        //remove null
        List<String> nullNames = Arrays.asList(
            "John", "Mary", null, "Bob", null, "Alice"
            );
        System.out.println(nullNames);
        List<String> onlyNames = nullNames.stream().filter(n->n!=null).collect(Collectors.toList());
        System.out.println(onlyNames);


    }
}
