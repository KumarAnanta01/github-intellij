package core_prac.java8.Function;

import java.util.function.Function;

public class Test2 {
    public static void main(String[] args)
    {

        Function<String,String> f=s->s.toUpperCase();
        System.out.println(f.apply("dipu"));

    }
}
