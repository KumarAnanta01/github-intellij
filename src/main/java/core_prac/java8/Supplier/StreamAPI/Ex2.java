package core_prac.java8.Supplier.StreamAPI;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Ex2 {
    public static void main(String[] args) {
        ArrayList<Integer> l = new ArrayList<Integer>();
        l.add(70);
        l.add(45);
        l.add(10);
        l.add(65);
        l.add(20);
        l.add(25);
        System.out.println(l);

        //List<String> sortedList= l.stream().sorted((i1,i2)->-i1.compareTo(i2))
        //-i1 reverse inter change agruments or add - symbol or
        List<Integer> sortedList = l.stream().sorted((i1, i2) -> i2.compareTo(i1))
                .collect(Collectors.toList());
        System.out.println(sortedList);
    }
}
