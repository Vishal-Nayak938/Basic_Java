import java.util.Scanner;

public class Challenge9FibbonacciSeries {
    public static void main(String args[])
    {
        Scanner s1=new Scanner(System.in);
        System.out.println("Enter A Number");
        int num=s1.nextInt();
        fibonacciSeries(num);
    }
    static void fibonacciSeries(int num)
    {
        int sum=0, i=0;
        while(i<num)
        {
            int n=1;
            sum=sum+i+n;

            System.out.println(sum);
            i++;
            n++;
        }
    }


}
