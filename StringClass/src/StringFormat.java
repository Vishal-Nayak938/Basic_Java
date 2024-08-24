public class StringFormat {
    public static void main(String args[])
    {
        String name="vishal kumar";
        int marks =6746745;
        System.out.println(name.length());
        System.out.println(name.substring(2,10));
        System.out.println(name.indexOf());
        System.out.println("hello, "+name+" your marks are: "+marks+".");//wastage of memory so many times;

        System.out.printf("hello, %5s your marks are: %,8d%%.",name,marks);//f means format,it saves extra memory;

    }
}
