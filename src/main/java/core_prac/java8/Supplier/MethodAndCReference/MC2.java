package core_prac.java8.Supplier.MethodAndCReference;
interface Inter{
    public void add(int a,int b);

}
public class MC2
{
    public static void sum(int x,int y)
    {
        System.out.println("the sum is:"+(x+y));
    }
    public static void main(String[] args)
    {
        Inter i=(a,b)-> System.out.println("the sum is:"+(a+b));
                i.add(10,20);
        Inter i1=MC2::sum;
        i1.add(100,200);

    }
}
