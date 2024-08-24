import java.util.Scanner;
public class UsingScanner {
    public static void main(String ar[])
    {
        Scanner s=new Scanner(System.in);
    System.out.println("Please\tEnter\tYour\tName");
    String name=s.next();
    System.out.println("Welcome to the new world Mr.\\Mrs "+name+".");
    }
}
