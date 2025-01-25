package LogicalP;

import java.util.* ;

public class ReadKeyBoard
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);//System.in reference to keyboard and here in is an object

       // int  x=sc.nextInt();
        //float x=sc.nextFloat();
       // String x=sc.next();
      //  String x=sc.nextLine();
       // System.out.println(x);
//        System.out.println();//  System.out object attach to monitor  ln means move the cursor to next line
//        int x,y;
//        System.out.println("Eneter 2 numbers: ");
//        x=sc.nextInt();
//        y=sc.nextInt();
//
//        int z=x+y;
//        System.out.println("Sum is "+z);


        sc.useRadix(2);
        int x=sc.nextInt();
        System.out.println(x);
    }
}
