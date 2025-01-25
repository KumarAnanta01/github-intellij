package core_prac.java8.Fi;

import java.util.ArrayList;
import java.util.Collections;

class Employee{
    String name;
    int eno;
    Employee(String name,int eno)
    {
        this.name=name;
        this.eno=eno;
    }
public String toString()
{
    return eno+" : "+name;
}

}

public class Test8 {
    public static void main(String[] args) {
//        Employee e=new Employee("Durga",100);
//        System.out.println(e);
        ArrayList<Employee> l=new ArrayList<Employee>();//to hold Employee obj we created ArrayList
        l.add(new Employee("Durga",106));
        l.add(new Employee("raj",105));
        l.add(new Employee("raka",110));
        l.add(new Employee("raju",109));
        l.add(new Employee("putul",104));
        System.out.println(l);
        Collections.sort( l,(e1,e2)->e1.name.compareTo(e2.name));
        System.out.println(l);
    }
}
