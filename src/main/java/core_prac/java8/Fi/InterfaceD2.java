package core_prac.java8.Fi;

public interface InterfaceD2
{
    public int squreIt(int n);

}

   class Dipu{

       public static void main(String[] args) {
InterfaceD2 d= n-> n*n;
           System.out.println(d.squreIt(4));
       }
   }
