import java.util.Scanner;
public class Math_PI {
    public static void main(String args[])
    {
        Scanner s1=new Scanner(System.in);
        System.out.print("Enter the radius of circle: ");
        int radi=s1.nextInt();
        double area=Math.PI*Math.pow(radi,2);
        System.out.printf("the area of circle is : %f",area);
    }
}
