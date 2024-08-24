public class StringBuffer {
    public static void main(String args[])
    {
        StringBuilder sb=new StringBuilder("this is StringBuilder.");
        sb.append(" StringBuffer is also like this.");
        sb.append(" both are the same in nature. ");
        sb.append(234);
        sb.append(459);
        System.out.println(sb.toString());
        //append method concatinants strings after the first ;

    }
}
