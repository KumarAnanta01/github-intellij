package core_prac.java8.Supplier;

import java.util.function.IntPredicate;
import java.util.function.Predicate;

public class Test8
{


        public static void main(String[] args) {
            int[] x={0,5,10,15,20,25,30};
            IntPredicate p= i->i%2==0;
            for ( int x1:x
                 ) {
                if(p.test(x1))
                {
                    System.out.println(x1);
                }
                
            }
        }
    }


