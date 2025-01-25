package core_prac.java8.Supplier.StreamAPI;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class SA5DNSO {


    public static void main(String[] args) {
        ArrayList<String> l = new ArrayList<String>();
        l.add("Sunny");
        l.add("Kajal");
        l.add("Priyanka");
        l.add("Anuska");
        l.add("Malika");

        System.out.println(l);


       // List<String> sortedList = l.stream().sorted().collect(Collectors.toList());
        List<String> sortedList = l.stream().sorted((s1,s2)->s2.compareTo(s1)).collect(Collectors.toList());
        System.out.println(sortedList);
    }


}
