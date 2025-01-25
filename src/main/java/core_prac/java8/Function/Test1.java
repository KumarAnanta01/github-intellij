package core_prac.java8.Function;

import java.util.function.Function;

public class Test1
{
    public static void main(String[] args)
    {
        Function<Integer,Integer> f=i->i*i;
        System.out.println(f.apply(4));

    }
}
