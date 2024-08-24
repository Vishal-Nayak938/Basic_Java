import java.util.Scanner;

public class ToFindSumAndAverage {
    public static void main(String args[])
    {
        Scanner s1=new Scanner(System.in);
        double [] arr=new double[5];
        System.out.println("Enter Array Elements.");
        int i=0;
        while(i<arr.length)
        {
            arr[i]=s1.nextDouble();
            i++;
        }

        arraySum(arr);
    }
    static void arraySum(double arr2[])
    {
        double sum=0;
                int j=0;
        while(j<arr2.length)
        {
               sum+=arr2[j];
               j++;
        }
        System.out.println("The Sum Of All Array Element Is "+sum);
        double avg=sum/arr2.length;
        System.out.println("The Average Of Array Elements "+avg);

    }

}
