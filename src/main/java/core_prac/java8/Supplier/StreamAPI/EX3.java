package core_prac.java8.Supplier.StreamAPI;

import java.util.ArrayList;

public class EX3 {
    public static void main(String[] args) {
        ArrayList<Integer> l=new ArrayList<Integer>();
        l.add(10);
        l.add(0);
        l.add(15);
        l.add(5);
        l.add(20);

        System.out.println(l);
      l.stream().forEach(System.out::println);
    }
}
