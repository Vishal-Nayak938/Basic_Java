import java.util.InputMismatchException;
import java.util.Scanner;

public class oddEven {
    public static void main(String args[])
    {
        Scanner s1=new Scanner(System.in);
        System.out.println("Please Enter Any Number To Check Odd or Even!");
        long e=0;
        try {
             e = s1.nextInt();
        }
        catch (InputMismatchException e1)
        {

        }
        if(toCheckOddEven(e))
       {
           System.out.println(e+" Is Even.");
       }
       else {
           System.out.println(e+" Is Odd.");
       }
    }
   static boolean toCheckOddEven(long e)
    {
        if(e%2==0)
        {
            return true;
        }
        return false;
    }
}
