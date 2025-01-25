package core_prac.java8.Supplier.StreamAPI;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class SA1 {
    public static void main(String[] args) {
        ArrayList<Integer> l=new ArrayList<Integer>();
        l.add(0);
        l.add(5);
        l.add(10);
        l.add(15);
        l.add(20);
        l.add(25);
        System.out.println(l);
        List<Integer> updatedl= l.stream().map(i->i+5).collect(Collectors.toList());
        System.out.println(updatedl);
    }
}
