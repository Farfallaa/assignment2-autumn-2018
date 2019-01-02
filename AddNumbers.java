package worksheet02;

import java.util.Scanner;

public class AddNumbers {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("please enter a number that's 0 - 1000:");
        int number = sc.nextInt();
        //find last digit:
        int lastDigit = number%10;
        System.out.println(lastDigit);
        //find middle digit by dividing the number by 10 and finding the remainder
        int number1 = number/10;
        int decimals = number1%10;
        System.out.println(decimals);
        //find the first digit
        int number2 = number1/10;
        int hundreds = number2%10;
        System.out.println(hundreds);
        //find the result:
        int result = lastDigit+decimals+hundreds;
        System.out.println(result);


    }
}
