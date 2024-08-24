import java.util.Scanner;

public class NewSwitchCase {
    public static void main(String args[])
    {
        System.out.println("Enter your choice : ");
        Scanner s1=new Scanner(System.in);
        int choice=s1.nextInt();
        String output= switch(choice){
         case 1-> "Hello";
         case 2-> "Bye-Bye";
         case 3-> "I am vishal kumar";
         case 4-> "i would like to express myself";
         case 5-> "I am graduated";
            default -> "wrong";
        };
        System.out.println(output);
    }
}
