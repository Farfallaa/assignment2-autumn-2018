package worksheet02;

import java.util.Random;

import static java.lang.Character.toUpperCase;

public class RandomUppercaseLetter {
    public static void main(String[] args) {

        //create an array filled with alphabet letters:
       char[]alphabet = new char[26];
       int index = 0;
       for(char c = 'a'; c <= 'z'; c++){
           alphabet[index++] = c;
       }
       //print random number from 0-26
       int minValue = 0;
       int maxValue = alphabet.length;
       Random rand = new Random();
       int randomNum = rand.nextInt((maxValue - minValue) +1) + minValue;

       //print random letter from alphabet array
       System.out.println(toUpperCase((alphabet[randomNum])));

    }
}
