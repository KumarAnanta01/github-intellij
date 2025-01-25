package core_prac.java8;

import java.util.function.*;

public class Test
{
//public static int squreIt(int n)
//{
//      return n*n;
//}

    public static void main(String[] args)
    {
        Function<Integer,Integer> f=i->i*i;
        System.out.println("The Squre of 40:" +f.apply(40));
        System.out.println("The Squre of 50:" +f.apply(50));

    }
}
