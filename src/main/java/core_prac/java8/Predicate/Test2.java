    package core_prac.java8.Predicate;

    import java.util.ArrayList;
    import java.util.function.Predicate;
    class Employee{
        String name;
        double salary;
        Employee(String name,double salary){
            this.name=name;
            this.salary=salary;
        }
    }

    public class Test2
    {
        public static void main(String[] args)
        {
            ArrayList<Employee> l=new ArrayList<Employee>();
            l.add(new Employee("Dipu",2000));
            l.add(new Employee("ravi",5000));
            l.add(new Employee("shiv",3000));
            l.add(new Employee("mahesh",6000));
            l.add(new Employee("sagar",8000));

    Predicate<Employee> p= e->e.salary>3000;
    for (Employee e1:l){
        if (p.test(e1))
        {
            System.out.println( e1.name+" :"+e1.salary);
        }
    }


        }
    }
