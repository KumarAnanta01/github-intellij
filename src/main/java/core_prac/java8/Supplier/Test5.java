package core_prac.java8.Supplier;

import java.util.ArrayList;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;
class Employee{
    int eno;
    String name;
    Employee(int eno,String name){
        this.eno=eno;
        this.name=name;
    }
}

public class Test5
{
    public static void main(String[] args) {
        ArrayList<Employee> l=new ArrayList<Employee>();
        BiFunction<Integer,String,Employee> f=(eno,name)->new Employee(eno,name);
        //Employee e1=f.apply(100,"durga");
        l.add(f.apply(100,"Durga"));
        l.add(f.apply(200,"Ravi"));
        l.add(f.apply(300,"Shiva"));
        l.add(f.apply(400,"Pavan"));
        for (Employee e:l
             ) {
            System.out.println("Employee number: "+e.eno);
            System.out.println("Employee name: "+e.name);
            System.out.println();


        }



    }
}