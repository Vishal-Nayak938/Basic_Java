

import java.util.Scanner;

public class Challenge6ToFindHCF
{
    public static void main(String args[])
    {
 Challenge6ToFindHCF c1=new Challenge6ToFindHCF();//Object Creation
 c1.toFindHCF();//Function Calling
    }

    int toFindHCF()//non-static method, Function Definition
    {
        Scanner s1 = new Scanner(System.in);
        System.out.print("Enter Any Two Numbers\t");
        int a=0,b=0;
        try {
             a = s1.nextInt();
            b = s1.nextInt();
        }
        catch(Exception e)
        {
            System.out.println("Please Enter 0-9 Digits.");
        }

//        System.out.println("I'm After Exception Handling ");

        int  c=(a>b)?b:a; //a=12 , b=15, Ternary Operator
        int i=c;
        while(i<=c)
        {
            if(a%i==0 && b%i==0)
            {
                System.out.println("The HCF Is "+i);
                return 0;
            }
            i--;
        }

     return 0;
    }

}
