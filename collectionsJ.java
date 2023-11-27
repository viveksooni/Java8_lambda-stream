import java.util.*;
import java.util.function.Consumer;
import java.util.function.Predicate;
public class collectionsJ
{
    public static void main(String[] args) {
        // System.out.println("hello");

        ArrayList<Integer> a = new ArrayList<>();
        a.add(1);
        a.add(2);
        a.add(3);

        ArrayList<Integer> b = new ArrayList<>();

        b.addAll(a);

        // System.out.println(b);

        ArrayList c = new ArrayList();//hetrogenious data
        c.add("Vivek");
        c.add(1);
        c.add(true);
        c.add(1,"hell");
        // System.out.println(c);
        // Collections.shuffle(a);
        // System.out.println(a);

        // Collections.sort(c);//can't sort hetrogenious
        // System.out.println(c);

        // for(Object i:c)//for hetrogineous
        // {
        //     System.out.println(i);
        // }
        
        // System.out.println("using iterator");
        // Iterator it =  c.iterator();
        // while(it.hasNext())
        // {
        //     System.out.println(it.next());
        // }

        ArrayList c_dub = new ArrayList();
        c_dub.addAll(c);
        System.out.println(c_dub);
        c_dub.removeAll(c);
        System.out.println(c_dub);
        
        Collections.sort(a,Collections.reverseOrder());
        System.out.println(a);

        Integer[] arr = {1,2};

        System.out.println(Arrays.toString(arr));
        ArrayList arr1 = new ArrayList(Arrays.asList(arr));
        System.out.println(arr1);

        
        Predicate<String> ans = n->(n.length()>5);
        System.out.println(ans.test("hello"));
}}