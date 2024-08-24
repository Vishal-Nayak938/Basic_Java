import java.util.Scanner;

public class Challenge3Factorial {
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter A Number ");
        int n=s.nextInt();//5
        valueOfFactorial(n);
    }
    static void valueOfFactorial(int n) {
        int i = 1;
        long multi = n;
        if (n > 0) {
            while (n > i) {
                multi = multi * i;//5
                i++;
            }
            System.out.println(multi);
        }
        else if(n==0)
        {
            System.out.println(Integer.parseInt("1"));
        }
        else if(n<0)
        {
            System.out.println("The Factorial Of This Number Is Not Defined");
        }
    }
}
