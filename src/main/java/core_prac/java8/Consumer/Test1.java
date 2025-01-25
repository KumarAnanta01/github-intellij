package core_prac.java8.Consumer;

import java.util.function.Consumer;

public class Test1 {
    public static void main(String[] args)
    {
        Consumer<String > c=s-> System.out.println(s);
        c.accept("Ananta ");
        c.accept("Durga software ");


    }
}
