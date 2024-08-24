public class Recursion {
    public static void main(String[] args)  {
        recurse();
    }

    static void recurse()
    {
        int c=0;

        System.out.println(c);
        recurse();// StackOverFlowException
    }

}
