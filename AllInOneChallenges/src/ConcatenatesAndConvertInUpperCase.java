import java.util.Scanner;

public class ConcatenatesAndConvertInUpperCase {
    public static void main(String args[])
    {
        Scanner s1=new Scanner(System.in);
        System.out.print("Enter First Name: ");
        String firstName=s1.next();
        System.out.print("Enter Second Name: ");
        String lastName=s1.next();
        System.out.print("The String Concatenation is : ");
        System.out.printf("%s %s ",firstName.toUpperCase(),lastName.toUpperCase());



        String s="vishal";
        String s2="vishal";
        System.out.println(s.toString());
        System.out.println(s2.toString());

    }
}
