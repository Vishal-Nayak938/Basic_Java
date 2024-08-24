import java.util.Scanner;

public class GusesingGame {
    public static void main(String[] args) {
        int a=(int)(Math.random()*10);
        System.out.println("Random number is "+a);

        Scanner s1=new Scanner(System.in);
        System.out.print("Enter A Guessing Number. ");
        int num=s1.nextInt();

        if(a==num)
        {
            System.out.println("You Have Won.");
        }
    else
    {
        System.out.println("You Have Lost.");
    }

    }
}
