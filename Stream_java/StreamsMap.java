package Stream_java;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class employee{
    String name;
    int sal;

    employee(String name,int sal)
    {
        this.name = name;
        this.sal = sal;
    }
}
public class StreamsMap {
    public static void main(String[] args) {
        
        List<String> vehicle = Arrays.asList("Toyota", "Honda", "Ford", "Mercedes", "BMW", "Chevrolet", "Nissan", "Tesla", "Volkswagen", "Audi");

        //change them to all uppercase 

        List<String> upperVehicle = vehicle.stream().map(v->v.toUpperCase()).collect(Collectors.toList());
        System.out.println(upperVehicle);

        //length of all the vehicle

        vehicle.stream().map(n->n.length()).forEach(System.out::println);


        List<Integer> numbers = Arrays.asList(1,3,4,5,6,7);

        //multiplie all by 3
        System.out.println(numbers);

        numbers = numbers.stream().map(n->n*3).collect(Collectors.toList());

        System.out.println(numbers);

        List<employee> emp = Arrays.asList(new employee("vivek", 10000),
        new employee("vinod", 20000),
        new employee("vinay", 30000),
        new employee("shreya", 40000),
        new employee("salu", 50000));

        //combining filter and map both

       List<employee> smart_emp =  emp.stream().filter(e->e.name.charAt(0)=='v')
       .map((e)->{
        e.sal=e.sal*9;
        return e;
        })
        .collect(Collectors.toList());

        for(employee w : smart_emp)
        {
            System.out.println(w.name+" = "+w.sal);
        }
    }   
    
}
