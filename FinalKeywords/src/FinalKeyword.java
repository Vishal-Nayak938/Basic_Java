public class FinalKeyword {
    public static void main(String args[])
    {
        CheckName cn=new CheckName(23,45);
        CheckName cn2=new CheckName(263,457);
        cn.setName("Anshul");
    }
}
class CheckName{
    public final String NAME="vishal";// we have to assign value of final variable at the time of variable creation
    void setName(String name)
    {
//        this.NAME=name;//cannot reassign final variables
        System.out.println(name);
    }
    CheckName(int a , int b)
    {
        System.out.println("(a,b) ("+a+","+b+")");
    }


}