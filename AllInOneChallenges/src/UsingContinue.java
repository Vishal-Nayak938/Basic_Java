import java.util.Scanner;

public class UsingContinue {
    public static void main(String[] args) {
        Scanner s1=new Scanner(System.in);
        System.out.println("Enter Numbers ");
        int sum=0,i=0;
        while(i<5)
        {

            int[] arr=new int[5];
            arr[i]=s1.nextInt();

            if(arr[i]<0)
            {
                continue;
            }
            else
            {
                sum=sum+arr[i];
            }
            i++;

        }
        System.out.println(sum);
    }
}
