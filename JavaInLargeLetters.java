package worksheet02;


public class JavaInLargeLetters {
    //create method to print gaps
    public static void printGaps(int noGaps) {
        for (int j = 0; j < noGaps; j++) {
            System.out.print(" ");
        }
    }
    //create method to print letters with 2 params: letter and how many)
    public static void printLetters(String letter, int noLetters) {
        for (int j = 0; j < noLetters; j++){
        System.out.print(letter);}
    }

    public static void main(String[] args) {
       //print patern line by line:
        //first line:
        printGaps(3);
        printLetters("J", 1);
        printGaps(4);
        printLetters("A", 1);
        printGaps(2);
        printLetters("V", 1);
        printGaps(5);
        printLetters("V", 1);
        printGaps(2);
        printLetters("A", 1);
        //second line:
        System.out.println();
        printGaps(3);
        printLetters("J", 1);
        printGaps(3);
        printLetters("A", 1);
        printGaps(1);
        printLetters("A", 1);
        printGaps(2);
        printLetters("V", 1);
        printGaps(3);
        printLetters("V", 1);
        printGaps(2);
        printLetters("A", 1);
        printGaps(1);
        printLetters("A", 1);
        //third line:
        System.out.println();
        printLetters("J", 1);
        printGaps(2);
        printLetters("J", 1);
        printGaps(2);
        printLetters("A", 5);
        printGaps(2);
        printLetters("V", 1);
        printGaps(1);
        printLetters("V", 1);
        printGaps(2);
        printLetters("A", 5);
        //forth line:
        System.out.println();
        printGaps(1);
        printLetters("J", 2);
        printGaps(2);
        printLetters("A", 1);
        printGaps(5);
        printLetters("A", 1);
        printGaps(2);
        printLetters("V", 1);
        printGaps(2);
        printLetters("A", 1);
        printGaps(5);
        printLetters("A", 1);

    }
}