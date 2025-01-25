package core_prac.java8.Predicate;

import java.util.function.Predicate;

public class Test4
{
    public static void main(String[] args)
    {
        Predicate<Integer> p = i->i%2==0;
        System.out.println(p.test(10));
        System.out.println(p.test(15));

    }
}
