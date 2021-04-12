/**
 * file: Driver_lab5.java
 * author: Andre Esteves Dias
 * course: MSCS 630L 711 21S
 * assignment: lab 5
 * due date: April 11, 2021
 */

package main.Lab5;

import java.util.Arrays;
import java.util.Scanner;

import static main.Lab4.AESCipher.aesRoundKeys;
import static main.Lab5.AESCipher.*;


public class Driver_lab5 {
  /**
   *
   * Main method that will execute the AES method from AESCipher.java given
   * the system key and a plaintext block. It will return the ciphertext. The
   * AES method stores the result ciphertext in the zeroth array index so
   * that it will pass the Driver_lab5Test.java
   */
  public static void main(String[] args) {


    Scanner enter = new Scanner(System.in);
    String systemKey = enter.next().toUpperCase();
    String plainText = enter.next().toUpperCase();
    String[] result = AES(plainText,systemKey);
    System.out.println(result[0]);
  }
}
