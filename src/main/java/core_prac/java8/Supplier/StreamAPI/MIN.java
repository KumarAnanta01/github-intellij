package core_prac.java8.Supplier.StreamAPI;

import java.util.ArrayList;




public class MIN
{
    public static void main(String[] args) {
        ArrayList<Integer> l=new ArrayList<Integer>();
        l.add(10);
        l.add(0);
        l.add(15);
        l.add(5);

        System.out.println(l);
        Integer min = l.stream().min((i1, i2) -> i1.compareTo(i2)).get();
        System.out.println(min);
    }
}
