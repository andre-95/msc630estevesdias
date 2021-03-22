/**
 * file: Driver_lab1.java
 * author: Andre Esteves Dias
 * course: MSCS 630L 711 21S
 * assignment: lab 2b
 * due date: March 15, 2021
 */

package main;

import java.util.Scanner;

public class Driver_lab2b {

  /**
   *The extended euclid algorithm works similar to the non-extended version. In
   * this case we go a step further to be more efficient and to keep a record
   * of values. The extended version still finds the greatest common divisor
   * between two integers as long as a is greater than or equal to b. It then
   * computes the values for d, x, and y that satifies the equation d= ax + by.
   *
   * This method, euclidAlgExt, will receive a pair of positive integers, and
   * returns an array of long integers of length three, corresponding to d,x,
   * and y.
   *
   * @param a (positive integer)
   * @param b (positive integer)
   * @return an array of long integers corresponding to d,x, and y.
   */


  public static long[] euclidAlgExt(long a, long b){
    //if b is equal to zero we can stop since we know the GCD and
    // subsequently x and y.
    if (b == 0){
      System.out.println("HI");
      return new long[] {a,1,0};

    }

    /**
     * Using recursion to determine the GCD(d) then go in the reverse order to
     * determine the values of x and y from the previous recursions.
     */

    long[] temp = euclidAlgExt(b,a%b);
    long d = temp[0];
    long x = temp[2];
    long y = temp[1] - (a/b) * temp[2];
    return new long[] {d,x,y};
  }

  public static void main(String[] args) {
    Scanner enter = new Scanner(System.in);
    while (enter.hasNext()) {
      long a = enter.nextLong();
      long b = enter.nextLong();
      long [] results = euclidAlgExt(a,b);
      for(long i: results){
        System.out.print(i +" ");
      }
    }
  }

}
