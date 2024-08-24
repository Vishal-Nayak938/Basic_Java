import java.util.Scanner;

public class Challenge5SumOfDigitsOfANumber {
    public static void main(String args[])
    {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter A Number: ");
        int num=input.nextInt();
        sumOfDigits(num);
    }

    static void sumOfDigits(int num) {
        int sum = 0;
        int i = 0;
         if(num<0)
         {
             num-=num;//ShortHand Operator
         }
        while (i <=num*i)
        {

            sum += num % 10;//ShortHand Operator
            num/=10;//ShortHand Operator
            i++;//unary Operator
        }
        System.out.println("The Sum Of Digit Is "+sum);
    }
}

