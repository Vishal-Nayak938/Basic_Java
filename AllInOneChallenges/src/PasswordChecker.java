import java.util.Scanner;
public class PasswordChecker {
    public static void main(String[] args) {
        int password=6754;
        Scanner s1=new Scanner(System.in);
        System.out.print("Enter Your Password : ");
        int n=s1.nextInt();
        passwordChecker(n,password);
    }

    static void passwordChecker(int n, int password)
    {
        int i=0;
        do {
             if(password==n) {
                 System.out.println("Right Password!"); break;
             }
            else
             {
                 System.out.println("Wrong Password!"); break;
             }

        }while(true);
    }

}
