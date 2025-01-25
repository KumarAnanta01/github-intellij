package core_prac.java8.Predicate;

import java.util.function.Predicate;

public class Test3
{

    public static void main(String[] args)
    {

        int[] x={0,5,10,15,20,25,30,35};
        Predicate<Integer> p1= i->i%2==0;
        Predicate<Integer> p2= i->i>10;

        //and(),or(),negate()//  for predicate joining
        System.out.println("the number which are even or > 10 are:");
        for (int x1:x)
        {
//            if (p1.and(p2).test(x1))//and
//            {
//            if (p1.or(p2).test(x1))//or
//            {

//            if (p1.test(x1))//even
//            {
            if (p1.negate().test(x1))// for negative numbers
            {

                System.out.println(x1);
            }
        }

    }
}
