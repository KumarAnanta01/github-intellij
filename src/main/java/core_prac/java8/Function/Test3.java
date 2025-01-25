package core_prac.java8.Function;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

class Student
{
    String name;
    int  l;
    Student(String name,int l)
    {
        this.name=name;
        this.l=l;
    }
}
public class Test3
{
    public static void main(String[] args)
    {
        // write a function  to find  grade of the student
        Function<Student,String > f=s->{
            int l=s.l;
            String grade=" ";
            if(l>=80) grade="A[Dictinction]";
            else    if(l>=60) grade="B[First class]";
            else    if(l>=50) grade="C[Second class]";
            else    if(l>=35) grade="D[Third class]";
            else     grade="E[Failed]";
            return grade;
        };
        Predicate<Student> p=s->s.l>60;
        Consumer<Student>  c=s1->{

            System.out.println("Student Name:" + s1.name);
            System.out.println("Student l:" + s1.l);
            System.out.println("Student Grade:" + f.apply(s1));
            System.out.println();
        };
        Student[] s={new Student("Durga",100),
                new Student("Sunny",65),
                new Student("Bunny",55),
                new Student("Chinny",45),
                new Student("Vinny",25),

        };
//        for (Student s1:s)
//        {
//            if(p.test(s1)) {
//                System.out.println("Student Name:" + s1.name);
//                System.out.println("Student l:" + s1.l);
//                System.out.println("Student Grade:" + f.apply(s1));
//                System.out.println();
//            }
//        }
for(Student s1:s){
    if(p.test(s1)) {
        c.accept(s1);
    }
}

    }
}
