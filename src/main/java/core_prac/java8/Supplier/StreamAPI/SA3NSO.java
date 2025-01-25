package core_prac.java8.Supplier.StreamAPI;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class SA3NSO
{
    public static void main(String[] args) {
        ArrayList<Integer> l = new ArrayList<Integer>();
        l.add(70);
        l.add(45);
        l.add(10);
        l.add(65);
        l.add(20);
        l.add(25);
        System.out.println(l);
        // long noOfFailedStudents= l.stream().filter(m->m<35).count();
        //Comparator<String> c=(i1,i2)->(i1<i2)?
        List<Integer> sortedList= l.stream().sorted((i1,i2)->(i1<i2)?1:(i1>i2)?-1:0)
                .collect(Collectors.toList());
        System.out.println(sortedList);
    }
}
