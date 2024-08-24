import java.util.Scanner;

public class ToGiveReservation {
    public static void main(String args[])
    {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter Your Marks\t");
        int marks=input.nextInt();
        toCheckGradeSystem(marks);
    }
    static void toCheckGradeSystem(int marks)
    {
        if(marks>=90)
        {
            System.out.println("You Have Got First Division In Class!");
        }
        else if(marks>=70 && marks<90)
        {
            System.out.println("You Have Got Second Division!");
        }
        else if (marks>=50 && marks<70)
        {
            System.out.println("You Have Got Third Division In Class!");
        }
        else {
            System.out.println("You Are Failed In The Examination!");
        }
    }
}
