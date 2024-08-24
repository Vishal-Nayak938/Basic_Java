import java.util.Scanner;

public class MaximumAndMinimumElementInArray {
    public static void main(String args[])
    {
int [] arr=new int[5];
        Scanner s1=new Scanner(System.in);
        System.out.println("Enter Array Element");
        int i=0;
                while(i<arr.length)
                {
                    arr[i]=s1.nextInt(); i++;
                }

                toFindMaximum(arr);

        toFindMinimum(arr);
    }

static void toFindMaximum(int arr[])
{
    int j=0;
 int max=arr[j];

    while(j<arr.length)
    {

        if(max<arr[j])
        {
            max=arr[j];
        }

        j++;
    }

    System.out.println("The Maximum Element Is -> "+max);
}

static void toFindMinimum(int arr3[])
{
int p=1,min=arr3[0];
while(p<arr3.length)
{
    if(min>arr3[p])
    {
        min=arr3[p];
    }
    p++;
}
    System.out.println("The Minimum Number Is -> "+min);
}

}






