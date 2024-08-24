import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner s2=new Scanner(System.in);
        System.out.println("Enter Your Choice: ");
        int choice=s2.nextInt();
switch(choice)
{
    case 1:
        System.out.println("Splender+");
           break;
    case 2:
    System.out.println("Platina");
    for(int i=0; i<=10;i++)
    {
        System.out.println(i);
    }
    break;
    case 3:
        System.out.println("HF deluxe");
        break;
    case 4:
        System.out.println("apache");
        break;
    case 5:
        System.out.println("Pulsur");
        break;
    default:
        System.out.println("Wrong Choice!");
            break;
}

    }
}