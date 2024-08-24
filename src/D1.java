
class ToString
{
int a=9,b=5;

    @Override
    public String toString() {
        return "ToString Method a= "+a+" and b= "+b;
    }
}

public class D1 {
    public static void main(String[] args) {
        System.out.println("Good Morning");
        ToString t1=new ToString();
        System.out.println(t1);
    }
}
