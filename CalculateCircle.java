package worksheet02;

public class CalculateCircle {
    //set final variables:
    public static final double PI = 3.14159265;
    public static double radius = 5;

    public static void main (String[] args){

        //perform calculations:

        double area = Math.round(PI*Math.pow(radius, 2));
        double circumference = Math.round(2*PI*radius);

        //print result:
        System.out.println("The circle has a radius of " + radius);
        System.out.println("Its area is "+area);
        System.out.println("Its circumference is "+circumference);
    }

}
