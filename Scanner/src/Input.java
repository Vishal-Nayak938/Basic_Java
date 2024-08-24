import java.util.Scanner;

public class Input {
public static void main(String args[])
{
    Scanner s1=new Scanner(System.in);

    System.out.print("enter any number\t");
    int a=s1.nextInt();
    System.out.println(a);
    System.out.print("Enter second number\t");
    double b=s1.nextDouble();
    System.out.println(b);
    System.out.println("Enter third number");
    float c=s1.nextFloat();
    System.out.println(c);
    System.out.println("enter fourth number");
    String s=s1.next();
    System.out.println(s);

}
}
