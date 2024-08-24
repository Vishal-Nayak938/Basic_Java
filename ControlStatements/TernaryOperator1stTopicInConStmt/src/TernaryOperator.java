import java.util.Scanner;

public class TernaryOperator {
    public static void main(String[] args) {

        Scanner s1=new Scanner(System.in);
        System.out.println("Enter any two numbers: ");
        int a=s1.nextInt();
        int b=s1.nextInt();

        if(ternaryOperator(a,b))
        {
            System.out.println(a+" Is Large.");
        }
        else
        {
            System.out.println(b+" Is Large.");
        }

    }

   static boolean ternaryOperator(int a,int b)
    {
        Boolean d=a>b ? true : false;
        return d;
    }

}
