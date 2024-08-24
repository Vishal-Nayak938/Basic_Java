public class This1 {
// Wrong Program *
    public static void main(String arg[])
    {
        int a=9,b=6;

        This1 t=new This1();
        t.usingThis(a,b);
    }

  void usingThis(int x,int y)
    {
      int a=x,b=y;
        System.out.println("a = "+x+" b = "+y);

    }

}
