import java.util.Scanner;
import java.lang.ArithmeticException;
public class PrimeOrComposite
  {
    public static void main(String args[])
    {
        Scanner s1=new Scanner(System.in);
        System.out.print("Enter A Number! ");

         int num = s1.nextInt();

        if(isPrime(num))
        {
            System.out.println(num + " Is Prime.");
        }
        else
        {
            System.out.println(num+" Is Composite.");
        }

    }

    static boolean isPrime(int num)
    {
        int n=num/2;
        for(int i=n;i>=2;i--)
        {
            if(num%i==0)
            {
                System.out.println(i);
                return false;
            }

        }
        return true;
    }

  }
