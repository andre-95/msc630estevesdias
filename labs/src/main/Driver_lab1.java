/**
 * file: Driver_lab1.java
 * author: Andre Esteves Dias
 * course: MSCS 630L 711 21S
 * assignment: lab 1
 * due date: March 8, 2021
 */

package main;
import java.util.Scanner;

public class Driver_lab1 {

    /**
     * str2int
     * This method will covert the input plaintext(string) into
     * integers that are stored in a Array called result.
     * The integers that are stored correspond to A to Z where A=0
     * The integers that are stored correspond to A to Z where A=0
     * and a space is equal to 26.
     *
     * It will return an Array where each element represents the number value
     * for the letter it represents.
     *
     * @param plainText (string of characters)
     * @return Array of integers representing the number value of each letter in the string.
     */
    public static int[] str2int(String plainText){
        String LCString = plainText.toLowerCase(); //make sure the string is the same case because of ASCII. I choose lowercase.
        int[] result = new int[LCString.length()]; //result array will hold the integers that corresponds to characters.
        char[] symbols = LCString.toCharArray(); //create an intermediate array to hold the lowercase string characters.
        
        for (int i=0; i<LCString.length(); i++) {
            if ((int)symbols[i] >=97) {
                result[i] = (int)symbols[i] - (int)'a'; //subtracting lowercase a will make a=0 as the starting point.
            }
            else if ((int)symbols[i] == 32) {
                result[i] = 26; //where the character is a space the ASCII value will default to 32. Change to 26.
            }
        }
        return result;
    }

    /**
     * Main method will use the str2int from above on the string of characters that is passed through.
     *
     * It will then print each element of the array with a space between.
     *
     */
    public static void main (String[] args) {
        Scanner enter = new Scanner(System.in);
        while (enter.hasNext()){
            String line = enter.nextLine();
            int[] answer = str2int(line);

            for(int i: answer){
                System.out.print(i +" ");
            }

        }
    }
}