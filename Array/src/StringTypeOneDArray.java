import java.util.Scanner;
public class StringTypeOneDArray {
    public static void main(String args[])
    {
    String[] st=new String[5];// String type array we can also declare its length at run time;
    inputStringElement(st);//function calling with parameter
    displayStringElement(st);//function calling with parameter
    }

    static void inputStringElement(String st2[])//function Definition

    {
     Scanner s1=new Scanner(System.in);
     int i=0;
     while(i<st2.length)
     {
         System.out.print("Enter "+i+" Name:\t");
    st2[i]=s1.next();
    i++;
     }

    }

    static void displayStringElement(String st3[])
    {
        int j=0;
        while(j<st3.length)
        {
            System.out.println(st3[j]);
            j++;
        }
    }

}
