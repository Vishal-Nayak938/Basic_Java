public class ConstructorUsingThisMethod {
    ConstructorUsingThisMethod()
    {
        this(45);
    }

    ConstructorUsingThisMethod(int x)
    {

        this("vishal");
        System.out.println(x);
    }

    ConstructorUsingThisMethod(String n)
    {
        this(45.67f);
        System.out.println(n);
    }

    ConstructorUsingThisMethod(float f)
    {
        System.out.println(f);
    }

    public static void main(String args[])
    {
      ConstructorUsingThisMethod c=new ConstructorUsingThisMethod()  ;
    }
}
