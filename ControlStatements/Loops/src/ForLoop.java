public class ForLoop {
    public static void main(String[] args) {
        for(int i=0;i<25;i++)//initialization,declearization and updation at one place;
        {
            if(i%2!=0)
            {
                continue;
            }

            System.out.println(i);

        }
    }
}
