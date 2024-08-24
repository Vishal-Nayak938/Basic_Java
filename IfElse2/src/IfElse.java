import java.util.Scanner;

public class IfElse {
    public static void main(String args[])
    {
        Scanner s1=new Scanner(System.in);
      System.out.print("Enter Your Age\t");
        int age=s1.nextInt();
        if(checkVoteEligibility(age))
        {
            System.out.println("You Are Eligible For Vote.");
        }
        else {
            System.out.println("You Are Not Eligible For Vote.");
        }
    }
    static boolean checkVoteEligibility(int age)
    {
        if(age>=18 && age<=65) {

            return true;
        }
        else if(age>65)
    {
        System.out.println("You Are Too Old Rest At House.");
        return false;
    }
        return false;
    }
}
