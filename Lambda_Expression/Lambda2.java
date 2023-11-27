package Lambda_Expression;

import java.util.function.Predicate;

/*
 * NOTES
 * there are some predefined Java Functional Interfaces
 * which are 
 * 1) Predicate
 * 2) Function
 * 3) Consumer
 * 4) Supplier
 * 
 * they are functional interfaces which have only one abstract method 
 */
public class Lambda2 {
    public static void main(String[] args) {
       

        //Predicate 

        // it has one abstarct method which is TEST()
        // it will return boolean value

        Predicate<String> p = (n)->n.length()>5;

        boolean ans = p.test("hello");
        System.out.println(ans);

        Predicate<Integer> p1 = (n)->n>10;

        if(p1.test(20))
        {
            System.out.println("it is greater than 10");
        }
        if(p1.test(2))
        {
            System.out.println("it is greater than 10");
        }else
        {
            System.out.println("smaller than 10");
        }


        // in this case we were only checking one condition if we want to check multiple conditions then

        // 1 - method (using && || opreators)

        Predicate<String> pr1 = n->n.charAt(0)=='v';
        Predicate<String> pr2 = n->n.length()>2;

        String[] names = {"vivek","vinod","shyam","ram","vi","viv"};

        for(String name:names)
        {
            if(pr1.test(name) && pr2.test(name))
            {
                System.out.println(name);
            }
        }

        // 2 method (using predicate.and(predicate2), .or(), .negate())
        // negate will turn ture into false and vise varsa

        System.out.println();
        System.out.println("using .and()");
        for(String name:names)
        {
            if(pr1.and(pr2).test(name))
            {
                System.out.println(name);
            }
        }

        boolean a = pr1.negate().test("hello");//it should be false but using negate makes it true
        System.out.println(a);
    }
    
}
