package Lambda_Expression;

import java.util.Date;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class Lambda4 {
    

    /*
     * consumer & supplier
     */
    public static void main(String[] args) {
        
        Consumer<String> c = (s)->System.out.println(s);;//consumer only take input does not return any value

        // c.accept("helll9");

        Consumer<String> c1 = (s)->System.out.println(s+"1");
        
        //chaining of consumer
        c.andThen(c1).accept("hello");

        //or
        Consumer<String> c2 = c.andThen(c1);
        c2.accept("eeeeeee");

        //Supplier

        Supplier<String> sup = ()->"hello";// In supplier it does not take any input but returns value so, we have to specify return type <String>
        
        System.out.println(sup.get());
        
        Supplier<Date> sup1 = ()->new Date();

        System.out.println(sup1.get().getDate());
        

    }
}
