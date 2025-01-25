package core_prac.java8.Supplier;

import java.util.function.Function;
import java.util.function.UnaryOperator;

public class Test12
{
    public static void main(String[] args)
    {
        UnaryOperator<Integer> f= i->i*i;
        System.out.println(f.apply(6));

    }
}