public class Hascode {
    public static void main(String args[])
    {
       Sum s=new Sum();
       Sum s1=new Sum();
        System.out.println(s==s1);
        System.out.println(s1);
    }

}

class Sum
{
    void Add(int a,int b)
    {
        System.out.println("The Addition Is "+(a+b));

    }

}
