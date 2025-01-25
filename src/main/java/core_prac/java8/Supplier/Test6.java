package core_prac.java8.Supplier;



import java.util.ArrayList;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;
class Employee1{
    String name;
    double salary;

    Employee1(String name,double salary){
        this.salary=salary;
        this.name=name;
    }
}

public class Test6
{
    public static void main(String[] args) {
       ArrayList<Employee1> l=new ArrayList<Employee1>();
       populate(l);

        BiConsumer<Employee1,Double> c=(e,d)->e.salary=e.salary+d;
        for (Employee1 e:l
             ) {
            c.accept(e,500.0);
            
        }
        for (Employee1 e:l
             ) {
            System.out.println("Employee Name: "+e.name);
            System.out.println("Employee Salary : "+e.salary);
            System.out.println();

        }

    }
    public static void populate(ArrayList<Employee1>l)
    {
        l.add(new Employee1("durga",1000 ));
        l.add(new Employee1("Sunny",2000 ));
        l.add(new Employee1("bunny",3000 ));
        l.add(new Employee1("chinny",4000 ));

    }
}
