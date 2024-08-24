import java.util.Scanner;

public class OneDArray {
    public static void main(String args[])
    {
     int[] arr=new int[10];
     inputArrayElement(arr);
     arrayDisplay(arr);
    }
    static void inputArrayElement(int arr3[])
    {
        Scanner s1=new Scanner(System.in);
    int i=0;
    while(i<arr3.length)
    {
        System.out.print("Enter "+i+" Number: ");
       arr3[i]=s1.nextInt();
       i++;
    }

    }

    static void arrayDisplay(int arr2[])
    {
        int i=0;
        while(i<arr2.length)
        {
            System.out.println("At Index "+i+": "+arr2[i]);
            i++;
        }

    }


}
