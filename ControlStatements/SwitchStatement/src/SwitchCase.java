import java.util.InputMismatchException;
import java.util.Scanner;
//  Old Switch Case
public class SwitchCase {
    public static void main(String args[])
    {
        Scanner s1=new Scanner(System.in);
        System.out.println("Enter A Case");
        int cas=0;
        try {
            cas = s1.nextInt();

        }
        catch(InputMismatchException e)
        {
            System.out.println("Please Enter only numeric digit.");
        }



        switchCase(cas);
    }
    static void switchCase(int c) {
        switch (c)
        {
            case 1:
                System.out.println("Sunday");
                break;
            case 2:
                System.out.println("Monday");
                break;
            case 3:
                System.out.println("Tuesday");
                break;
            case 4:
                System.out.println("Wednesday");
                break;
            case 5:
                System.out.println("Thursday");
                break;
            case 6:
                System.out.println("Friday");
                break;
            case 7:
                System.out.println("Saturday");
                break;
            default:
                System.out.println("Invalid Day Number: ");


        }
    }

}
