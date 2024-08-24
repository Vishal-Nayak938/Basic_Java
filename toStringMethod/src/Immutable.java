import java.lang.String;

public class Immutable {
    public static void main(String args[])
    {
        //String is immutable that means that value can not be changed.

        String name="vishal";
        String name1="vishal";
        String s1=new String("vishal");
        System.out.println(name);
        System.out.println(name1);
if(name==name1)// by == we compare the address of the object
{
    System.out.println("true");
}
else {
    System.out.println("false");

}
//        System.out.println(name.length());
//        System.out.println(name.substring(2,5));
        System.out.println(name.indexOf('l'));

//if(name.equals(name1)){//by using equals() we compare value in object.
//    System.out.println("true");
//        }
//    else{
//    System.out.println("false");
//    }

    }
}