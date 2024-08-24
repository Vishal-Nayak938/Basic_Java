import java.util.Scanner;

public class RelationlOperator {
    public static void main(String args[])
    {
        Scanner s1=new Scanner(System.in);
        System.out.println("Enter Any Two Numbers\t");
        int a=s1.nextInt();
        int b=s1.nextInt();
        if(relationalOperator(a,b))
        {
            System.out.println(a+" Is Large!");
        }
        else
        {
            System.out.println(b+" Is Large");
        }
    }

    static boolean relationalOperator(int x,int y)
    {
        if(x>y)
        {
           return true;
        }
        return false;
    }

}
