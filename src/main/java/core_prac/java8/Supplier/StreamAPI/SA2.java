package core_prac.java8.Supplier.StreamAPI;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class SA2
{
    public static void main(String [] args) {
        ArrayList<Integer> l = new ArrayList<Integer>();
        l.add(70);
        l.add(45);
        l.add(10);
        l.add(65);
        l.add(20);
        l.add(25);
        System.out.println(l);
       // long noOfFailedStudents= l.stream().filter(m->m<35).count();
        List<Integer> sortedList= l.stream().sorted().collect(Collectors.toList());
        System.out.println(sortedList);

    }

}
