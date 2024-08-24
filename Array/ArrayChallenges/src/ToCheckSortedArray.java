import java.util.Scanner;
// This Program is Wrong.
public class ToCheckSortedArray {
    public static void main(String args[])
    {
        Scanner s1=new Scanner(System.in);
        int [] arr=new int[5];
        System.out.println("Enter Array Element");
    int i=0;
    while(i<arr.length)
    {
        arr[i]=s1.nextInt();
        i++;
    }
isSorted(arr);

    }
    static void isSorted(int arr2[])
    {
        int j=0;
        while(j<arr2.length-1)
        {
            if(arr2[j]>arr2[j+1])//3 5 8 1 4
            {
                continue;
            }
         else {
                System.out.println("Not Sorted");
            }
            j++;
        }
        System.out.println("Array Is Sorted");
    }
}
