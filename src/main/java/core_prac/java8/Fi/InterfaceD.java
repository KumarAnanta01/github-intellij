package core_prac.java8.Fi;

public interface InterfaceD
{
public  void m1();
}
//class Demo implements InterfaceD{
//    @Override
//    public void m1() {
//        System.out.println("hello....");
//    }
//}
class Test3
{
    public static void main(String[] args) {
//        Demo d=new Demo();
//        d.m1();
       // InterfaceD i=new Demo();
        InterfaceD i=()->System.out.println("hello by lambda Expression");
        i.m1();// parent reference can use to hold child object thats why it is valid
    }
}
