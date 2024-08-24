import java.util.Scanner;

public class LogicalOperatorAnd {
    public static void main(String args[])
    {
        Scanner input =new Scanner(System.in);
        System.out.println("Enter Any Number\t");
        int n=input.nextInt();
        toCheckNaturalNumber(n);
    }
   static void toCheckNaturalNumber(int n)
    {
        if(n>=0 && n<50)
        {
            System.out.println(n+" Is Under 50 And Greater Than 0");
        }
        else if(n<0)
        {
            System.out.println(n+" Is Negative Number.");
        }
        else {
            System.out.println(n+" Is Greater Than 50.");
        }
    }

}
