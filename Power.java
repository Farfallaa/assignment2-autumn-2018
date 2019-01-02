package worksheet02;

public class Power {
    //method to print gaps:
    public static void printGaps(int noGaps) {
        for (int j = 0; j < noGaps; j++) {
            System.out.print(" ");
        }
    }

    public static void main(String[] args) {
        //first line
        System.out.print("a");
        printGaps(5);
        System.out.print("b");
        printGaps(5);
        System.out.print("pow(a,b)");
        System.out.println();
        //second line:

        int a = 1;
        int b = 2;
        while((a<6)&&(b<7)){
            System.out.print(a);
            printGaps(5);
            System.out.print(b);
            printGaps(5);
            System.out.println(Math.pow(a,b));
            a++;
            b++;
        }
            }
        }




