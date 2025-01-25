package core_prac.java8.Static;
interface interfS
{
    public static void m1(){
        System.out.println("interface static method");
    }

}
public class Test9 implements interfS
{
    public static void main(String[] args)
    {
        interfS.m1();// by name we are calling
        //m1();
       // Test9.m1();
       // Test9 t=new Test9();
       // t.m1();


    }
}
