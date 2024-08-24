public class FinalObject {
    public static void main(String args[])
    {

        FinalClass fc=new FinalClass("vishal",23);
    }
}
class FinalClass
{
    //when a class have all fields final we can say the is immutable(which value cannot be changed)


    final int age=23;
    final String name="vishal kumar";
    FinalClass(String name,int age)
    {
//        this.name=name;
//        this.age=age;
        StringBuilder sb=new StringBuilder();
        sb.append("this is the name: ").append(name);
        sb.append("\nthis is the age: ").append(age);
        System.out.println(sb.toString());
    }
}