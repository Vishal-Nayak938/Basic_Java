import java.util.Scanner;

public class VotingEligibility {
    public static void main(String args[])
    {
        System.out.println("Enter your age = ");
        Scanner s1=new Scanner(System.in);
        int age = s1.nextInt();
        String e= age>=18 && age<=65 ? "you're eligible for vote." : "you're not eligible for vote";
        System.out.println(e);

    }
}
