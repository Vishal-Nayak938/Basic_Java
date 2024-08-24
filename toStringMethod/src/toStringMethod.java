import java.lang.Object;

public class toStringMethod {
    int tier;
    int window;
    String name;
    String model;
    int fuelLevel;

    public toStringMethod(int tier, int window, String name, String model, int fuelLevel) {
        this.tier = tier;
        this.window = window;
        this.name = name;
        this.model = model;
        this.fuelLevel = fuelLevel;
    }

//    @Override
//    public String toString() {
//        StringBuilder sb=new StringBuilder("this is our car's info: ");
//        sb.append("tier: ").append(tier);
//        sb.append(", Windows are: ").append(window);
//        sb.append(", name is: ").append(name);
//        sb.append(", model is : ").append("4d34d");
//        sb.append(", fuelLevel: ").append(fuelLevel);
//        return sb.toString();
//    }
    public String toString()
{
    return "Car{ \n(tier are= "+tier+")\n (Windows are= "+window+") \n(name= "+name+")\n" +
            " (model= "+model+")\n(fuelLevel= "+fuelLevel+")\n } ";
}


    public static void main(String args[])
    {
    toStringMethod verna=new toStringMethod(4,5,"verna","ST23W1",20);

        System.out.println(verna);
    }
//    toString method is already in a class but we can explicitly define it in class.

}
