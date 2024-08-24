public class DoWhileInArray {
    public static void main(String[] args) {
        String[] str=new String[]{
          "vishal","anshul","aksahy","sachin","gautam"
        };
        int i=0;
        do {
                System.out.println(str[i]);
        i++;
        }while(i< str.length);



    }
}
