import java.util.Scanner;
public class AddTwoNumbers {
    public static void main(String ar[])
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Please Enter Two Number To Add ");
        try {
            int a = s.nextInt();
            int b = s.nextInt();
            int add = a + b;
            System.out.println("The Addition Of Two Numbers Is = " + add);
        }
        catch(Exception e)
        {

        }
    }
}
