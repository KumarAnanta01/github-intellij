package core_prac.java8.Supplier.StreamAPI;

import java.util.stream.Stream;

public class EX6 {
    public static void main(String[] args) {
       // Stream s=Stream.of(9,99,999,9999,99999);
        Stream <Integer>s=Stream.of(9,99,999,9999,99999);
        s.forEach(System.out::println);
        Integer[] i={10,20,30,40,50};
        Stream.of(i).forEach(System.out::println);
    }
}
