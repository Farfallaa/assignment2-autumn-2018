package worksheet02;

import java.util.Scanner;

public class CalculateCircleUserInput {
    public static final double PI = 3.14159265;


    public static void main (String[] args){
        //get radius from user:
        Scanner sc = new Scanner(System.in);
        System.out.println("please provide radius ");
        double radius = sc.nextDouble();
        //perform calculations
        double area = Math.round(PI*Math.pow(radius, 2));
        double circumference = Math.round(2*PI*radius);
        //display result:
        System.out.println("The circle has a radius of " + radius);
        System.out.println("Its area is "+area);
        System.out.println("Its circumference is "+circumference);
    }
}
