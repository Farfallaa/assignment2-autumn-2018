package worksheet02;

import java.util.Scanner;

public class MinutesToDays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("please enter minutes: ");
        int minutes = sc.nextInt();

        int days = minutes/60/24;
        int years = days/365;

        System.out.println(minutes+ " minutes = " + days + " days and " + years + " years!");
    }
}
