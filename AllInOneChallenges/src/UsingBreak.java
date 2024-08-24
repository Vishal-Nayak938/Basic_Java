import java.util.Scanner;

public class UsingBreak {
    public static void main(String[] args) {
        Scanner s1=new Scanner(System.in);
        System.out.println("Enter Number ");
        int i=0;
        while(true)
        {
            String a=s1.next();
            if(a.equals("exit"))
            {
                break;
            }
            System.out.println(a);
        }

    }
}
