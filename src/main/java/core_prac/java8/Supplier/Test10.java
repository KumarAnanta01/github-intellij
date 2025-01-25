package core_prac.java8.Supplier;

import java.util.function.IntFunction;

public class Test10
{
    public static void main(String[] args) {
        IntFunction<Integer> f=i->i*i;
        System.out.println(f.apply(5));
    }
}
