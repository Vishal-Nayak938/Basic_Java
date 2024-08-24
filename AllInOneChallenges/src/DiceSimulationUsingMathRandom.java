public class DiceSimulationUsingMathRandom {
    public static void main(String args[])
    {

        int i=0;
        while(i<=10) {
            int dice=(int)(Math.random()*7);
            System.out.printf("The Dice Number Is: %d\n", dice);
             i++;
        }
    }
}
