
// In java-12 it switch loop introduced to decrease code.


import java.util.Scanner;
import java.util.InputMismatchException;
public class NewSwitchCase {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter day number: ");
        int day=0;
        try {
            day = input.nextInt();
        }
        catch(InputMismatchException e)
        {
            System.out.println("invalid number :");
        }
        newSwitch(day);
    }

    static void newSwitch(int day)
    {
        String output=switch(day)
        {
            case 1-> "Sunday";
            case 2-> "Monday";
            case 3-> "Tuesday";
            case 4-> "Wednesday";
            case 5-> "Thursday";
            case 6-> "Friday";
            case 7-> "Saturday";
            default -> "invalid number";
        };

        System.out.println("the day is "+output);

    }


}
