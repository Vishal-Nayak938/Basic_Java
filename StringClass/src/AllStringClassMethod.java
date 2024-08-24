public class AllStringClassMethod {
  public static void main(String args[])
  {
      car c1=new car();
      c1.car();
  }
}
class car
{
    void car()
    {
        String name="vishal nayak";
        String name1="vishal nayak";
        System.out.println("the length of the name is : "+name.length());
        System.out.println("Index of space : "+name.indexOf(" "));
        System.out.println("the substring is : "+name.substring(2,11));
        System.out.println(name.equals(name1));

    }
}