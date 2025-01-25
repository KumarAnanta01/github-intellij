package core_prac.java8.Function;

import java.util.function.Function;

public class Test4
{
    public static void main(String[] args) {
        Function<Integer,Integer> f1=i->2*i;
        Function<Integer,Integer>  f2=i->i*i*i;
        System.out.println(f1.andThen(f2).apply(2));
        System.out.println(f1.compose(f2).apply(2));
    }
}
