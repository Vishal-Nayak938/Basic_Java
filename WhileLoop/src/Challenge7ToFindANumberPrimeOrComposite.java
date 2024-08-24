import java.util.Scanner;

public class Challenge7ToFindANumberPrimeOrComposite {
    public static void main(String args[])
    {
        Scanner s1=new Scanner(System.in);
        System.out.println("Please Enter A Number To Check Prime Or Composite.");
        int num=s1.nextInt();

        if(isPrime(num))
        {
            System.out.println(num+" Is A Prime Number!");
        }
        else{
            System.out.println(num+" Is A Composite Number");
        }
    }
    static boolean isPrime(int num)
    {
        int i=2;
        while(i<num)
        {
            if(num%i==0)
            {
                System.out.println("The Number Is Divided By "+i);
                return false;
            }

            i++;
        }

        return true;
    }

}
