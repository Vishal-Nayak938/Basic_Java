import java.util.Scanner;
/** vishal nayak*/
public class ANDOperator {
    public static void main(String[] args) {
        Scanner s1=new Scanner(System.in);
        System.out.print("Enter Any Two Numbers\t");
        int a=s1.nextInt();
        int b=s1.nextInt();
        andOperator(a,b);
    }
    static void andOperator(int a,int b)
    {
        System.out.println(a&b);
        System.out.println(a|b);
        System.out.println(a^b);
        System.out.println(~a);
        System.out.println(a<<b);
        System.out.println(a>>b);
    }
}
