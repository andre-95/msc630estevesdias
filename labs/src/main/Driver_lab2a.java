/**
 * file: Driver_lab1.java
 * author: Andre Esteves Dias
 * course: MSCS 630L 711 21S
 * assignment: lab 2a
 * due date: March 15, 2021
 */

package main;

import java.util.Scanner;

public class Driver_lab2a {

  /**
   * euclidAlg
   * This method will receive a pair of positive integers and returns the
   * corresponding greatest common divisor as an integer.
   *
   * @param a (positive integer)
   * @param b (positive integer)
   * @return the greatest common divisor.
   */
  public static long euclidAlg(long a, long b){

    long a2; //Used as a temporary storage in case a is less than b.

    if (a < b){
      a2 = a;
      a = b;
      b = a2;
    }

    long gcd = a % b;

    //Calculate the greatest common divisor.
    while(a % b !=0) {
      gcd = a % b;
      a = b;
      b = gcd;
    }

    //In case the greatest common divisor returns 0 then b is the actual GCD.
    if (gcd == 0){
      return b;
    }
    else {
      return gcd;
    }
  }

  /**
   * Main method that receives two long integers and calls on the euclidAlg
   * to compute the greates common divisor.
   *
   * @param args
   */
  public static void main(String[] args){
    Scanner enter = new Scanner(System.in);
    while (enter.hasNext()) {
      long a = enter.nextLong();
      long b = enter.nextLong();
      long answer = euclidAlg(a, b);
      System.out.println(answer);
    }

  }
}
