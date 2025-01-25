package core_prac.java8.Supplier;

import java.util.function.Function;

public class Test9
{
    public static void main(String[] args) {
        Function<Integer,Integer> f=i->i*i;
        System.out.println(f.apply(4 ));
    }
}
