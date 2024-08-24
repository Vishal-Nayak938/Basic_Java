public class DefaultValueOfNonPrimitiveDataTypes {
    static String n;// default value of non-primitive data types is null except array.
    static int a;// default value of primitive data types and array is zero .
    static int[] arr=new int[5];
    static boolean b;

    public static void main(String[] args) {

        System.out.println(arr[4]);
        System.out.println(n);
        System.out.println(a);
        System.out.println(b);// default value of boolean is false.
    }
}
