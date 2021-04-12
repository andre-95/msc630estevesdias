/**
 * file: Driver_lab1.java
 * author: Andre Esteves Dias
 * course: MSCS 630L 711 21S
 * assignment: lab 4
 * due date: March 21, 2021
 */

package main.Lab4;

import java.util.Scanner;

import static main.Lab4.AESCipher.aesRoundKeys;

public class Driver_lab4 {
  /**
   *
   * Main method that will execute the aesRoundKeys method from AESCipher
   * .java on a system input string of length 16-hex. The output will be all
   * 11 rows of the string array corresponding to each round key.
   */
  public static void main(String[] args) {

    Scanner enter = new Scanner(System.in);
    String input = enter.nextLine();
    String[] roundKeysHex = aesRoundKeys(input);

    for (String result: roundKeysHex) {
      System.out.println(result);
    }
  }
}
