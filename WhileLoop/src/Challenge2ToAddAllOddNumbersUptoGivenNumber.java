import java.util.Scanner;

public class Challenge2ToAddAllOddNumbersUptoGivenNumber {
    public static void main(String args[])
    {
        Scanner s1=new Scanner(System.in);
        System.out.println("Enter a Number Till You Want To Add Odd Numbers :");
        int num=s1.nextInt();
        toAddOdd(num);
    }
    static void toAddOdd(int num)
    {
        int sum=0;
        int i=1;
        while(i<num)
        {
            if(i%2!=0)
            {
                sum =sum+i;
            }
            i++;
        }
        System.out.println("The Addition Of Odd Number Is "+sum);
    }
}
