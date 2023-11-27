package Lambda_Expression;

import java.util.function.Function;

public class Lambda3 {
    
    // we are going to use function in this one 
    // it's abstract method is "apply()"
    // it takes argument and also returns
    // when declaring specify both argument type and return type function<argument Type, return type>



    public static void main(String[] args) {
        
            Function<Integer,Integer> f = n->n*n;
            Function<Integer,Integer> f1 = n->n+2;
            // System.out.println(f.apply(2));

            System.out.println(f.andThen(f1).apply(2));//ans 6
            System.out.println(f1.andThen(f).apply(2));//ans 16

            System.out.println(f1.compose(f).apply(2));//compose function just call 2nd function before and 1st function

            Function<String,Integer> f2 = (s)->s.length();

            System.out.println(f2.apply("hello"));



    }

}
