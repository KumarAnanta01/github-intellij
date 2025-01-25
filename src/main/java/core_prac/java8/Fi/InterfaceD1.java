package core_prac.java8.Fi;

public interface InterfaceD1
{
public void add(int a,int b);
}

class Test03{
    public static void main(String[] args) {
        InterfaceD1 d1=( a, b)-> System.out.println("The Sum:"+(a+b));
        d1.add(10,20);
        d1.add(100,200);
        d1.add(1000,2000);
    }
}
