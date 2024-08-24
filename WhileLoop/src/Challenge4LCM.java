import java.util.Scanner;

public class Challenge4LCM {
    public static void main(String args[])
    {
        Scanner s1=new Scanner(System.in);
        System.out.print("Enter Any Two Numbers ");
      int a=s1.nextInt();
      int b=s1.nextInt();
      lcm(a,b);
    }
    static int lcm(int a,int b) {
        int i = 1;
        while (true) {
            if (i%a == 0 && i % b == 0) {
                System.out.println("The LCM Is " + i);
                return 0;
            }
            i++;
        }

    }
}
