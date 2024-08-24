import java.util.Scanner;

public class StringUsingCharArray {
    public static void main(String args[])
    {
        Scanner s1=new Scanner(System.in);
        String[] arr=new String[]{"hello,", "this is ", "the best course ","ever on youtube " ,"so like it ..."};
        StringBuilder sb=new StringBuilder();
        int i=0;
        for(String s:arr)
        {

           sb.append(s);
        }
        System.out.println(sb);



//        while(i<arr.length)
//        {
//            StringBuilder sb=new StringBuilder();
//            s=s+sb.append(arr[i]);
//           i++;
//        }
//        System.out.println(s);
    }
}
