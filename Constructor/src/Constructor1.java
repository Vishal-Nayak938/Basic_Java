public class Constructor1 {
   String color,Name;
    Constructor1(int a,int b)//parametrized constructor;
    {
        color="Black";
        Name="Vishal";
        System.out.println("Name = "+Name+": Color = "+color+"\n The Addition is "+(a+b));
    }

    public static void main(String args[])
    {

        Constructor1 c1=new Constructor1(12,34);
        Constructor1 c2=new Constructor1(12,45);

    }
}
