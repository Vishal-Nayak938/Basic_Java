public class MaximumElementInArray {
    public static void main(String args[])
    {
        int[] arr=new int[]{12,54,32,134,213,56};
        int max=0;
        for(int n : arr)
        {

            if(arr[0]<arr[0+1])
            {
                max=arr[1];
            }

        }
        System.out.println(max);
    }

}
