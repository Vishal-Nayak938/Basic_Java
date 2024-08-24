import java.util.Scanner;

public class Challenge8ToReverseANumber {
    public static void main(String args[])
    {
        Scanner s1=new Scanner(System.in);
        System.out.print("Enter A Number\t");
        int num=s1.nextInt();
        toReverse(num);
    }
    static int toReverse(int num)
    {
        int i=1;
        while(i<=num*i)   //num= 567
        {
            int n=num%10;
            System.out.print(n+"");
            num/=10;
            i++;
        }

        return 0;
    }


}
