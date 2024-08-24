import java.util.Scanner;

public class NumberOfOccuranceInArray {
    public static void main(String[] args) {
        Scanner s1=new Scanner(System.in);
        int[] arr=new int [5];
        System.out.println("enter array element");
        int i=0;
        while(i<arr.length)
        {
            arr[i]=s1.nextInt();
            i++;
        }
        System.out.println("Enter Occurance Number ");
        int num=s1.nextInt();

       int k= numberOfOccurance(arr,num);
       if(k>0)
       {
           System.out.println("The Occurance Of The Number Is "+k);
       }
       else if(k==0)
       {
           System.out.println("The Given  Number Is Not In Array. ");
       }
    }
    static int numberOfOccurance(int arr2[],int num)
    {

        int j=0,count=0;
        while(j< arr2.length)
        {

                if (num==arr2[j])
                {
                    count++;
                }
            j++;
        }
       return count;
    }

}
