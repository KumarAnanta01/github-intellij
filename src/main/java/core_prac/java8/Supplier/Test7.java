package core_prac.java8.Supplier;

import java.util.function.Predicate;

public class Test7 {
    public static void main(String[] args) {
        Predicate<Integer> p=i->i%2==0;
        System.out.println(p.test(10));
    }
}
