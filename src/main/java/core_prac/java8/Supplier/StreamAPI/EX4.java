package core_prac.java8.Supplier.StreamAPI;

import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.function.Function;

public class EX4 {
    public static void main(String[] args) {
        ArrayList<Integer> l=new ArrayList<Integer>();
        l.add(10);
        l.add(0);
        l.add(15);
        l.add(5);
        l.add(20);

        System.out.println(l);
     // Consumer<Integer> c = i->{
         //   System.out.println("The Square of " +i+" is:"+(i*i));
       //      };
        l.stream().forEach(i->{System.out.println("The Square of " +i+" is:"+(i*i));});
    }
}
