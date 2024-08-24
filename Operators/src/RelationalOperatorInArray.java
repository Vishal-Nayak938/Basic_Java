import java.util.Scanner;

public class RelationalOperatorInArray {
    public static void main(String args[])
    {
        Scanner s1=new Scanner(System.in);
        int[] arr=new int[10];
                for(int i=0;i<arr.length;i++)
                {
                    arr[i]=s1.nextInt();
                }
        toCheckLargeNumberInArray(arr);

    }
   static  void toCheckLargeNumberInArray(int arr[])
    {
        int pivot=arr[0];//5 4 8 9 3 2
        for(int j=0;j<arr.length-1;j++)
        {
            if(pivot>arr[j+1])
            {
              continue;
            }
            else
            {
         pivot=arr[j+1];
            }

        }
        System.out.println(pivot+" Is Maximum Number");
    }

}
