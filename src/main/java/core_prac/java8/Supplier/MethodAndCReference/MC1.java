package core_prac.java8.Supplier.MethodAndCReference;

public class MC1
{
    public static void m1()
    {
        for(int i=0;i<10;i++)
        {
            System.out.println("Child Thread");
        }
    }
    public static void main(String[] args) {
        Runnable r=MC1::m1;//method reference
        Thread t=new Thread(r);
        t.start();
        for(int i=0;i<10;i++)
        {
            System.out.println("main Thread");
        }

    }
}
