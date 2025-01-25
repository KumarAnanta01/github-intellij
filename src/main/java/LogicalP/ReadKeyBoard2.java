package LogicalP;

import java.util.Scanner;

public class ReadKeyBoard2
{
    public static void main(String[] args)
    {

        Scanner s1=new Scanner(System.in);
        String name;
        System.out.println("may i know your name");
      name=  s1.nextLine(); //assign to the variable name
        System.out.println("welcome mr/ms :"+ name);

    }

}
