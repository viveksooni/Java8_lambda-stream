package Stream_java;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamReduce {
    
    /*
     * in this episode we will see 
     * Terminal methods
     * max() -->> return Optional object(optional is class name)
     * min()--> return Optional
     * reduce() --> returns Optional
     * toArray() --> Object type array[]
     */
    public static void main(String[] args){

        List<Integer> arr = Arrays.asList(-12,1,2,32,4,5,6);

        //max()
        //returns Optional object and to get its valuee use .get() method
        Optional<Integer> maxi = arr.stream().max((value,comparingValue)->{return value.compareTo(comparingValue);});

        System.out.println(maxi.get());

        //min()
        // returns Optional object and to get its valuee use .get() method
        // get returns Integer object
        int mini = arr.stream().min((v1,v2)->v1.compareTo(v2)).get();
        System.out.println(mini);

        //reduce
        // returns Optional object as well

        //it is used to combine all element of the collections in one object

       int k=  arr.stream().reduce((value,combinedValue)->{
            return value+combinedValue;
        }).get();
        System.out.println(k);

        

        //*** ToArray method ***/
        List<Integer> list1 = Arrays.asList(1,2,3,4,5);

        Object[] array = list1.stream().toArray();
        
        for(Object a:array)
        {
            System.out.println(a);
        }

    }
}
