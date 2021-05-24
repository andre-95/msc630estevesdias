/**
 * file: RSA.java
 * author: Andre Esteves Dias
 * course: MSCS 630L 711 21S
 * assignment: Project
 * due date: 5/23/2021
 */

import java.math.BigInteger;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class Driver {

  /**
   * Main program that will ask for you to create a User Name and Password.
   * It will then print the encrypted User Name and Password. Next it will ask
   * you for the user name you created. I then encrypt the entered username and
   * compare it to the original used to create the account. If the numbers
   * match then the encrypted username is correct, else it will ask you for
   * the correct username. It will then ask for the password and perform the
   * same encrypted comparison. Once the correct password is entered it will
   * then decrypt and print the Username and Password.
   * compare
   * @param args
   */
  public static void main(String[] args) {
    BigInteger p = RSA.primes(2048); //2048 bit prime number
    BigInteger q = RSA.primes(2048); //2048 bit prime number
    BigInteger n = RSA.genmodulus(p, q); //p*q, modulus
    BigInteger phi = RSA.eulerTF(p, q); //Calc. phi using Euler totient function
    BigInteger e = RSA.e(phi); //Used for encryption
    BigInteger d = RSA.d(e, phi); //Used fir decryption

    Scanner enter = new Scanner(System.in);
    System.out.println("Create a User Name:");
    String userName = enter.next();
    System.out.println("Create a password:");
    String password = enter.next();

    //Convert user name and password different to byte array.
    byte[] bytesUN = userName.getBytes(StandardCharsets.UTF_8);
    byte[] bytesPW = password.getBytes(StandardCharsets.UTF_8);

    //Convert byte array to BigInteger
    BigInteger plaintextUN = new BigInteger(bytesUN);
    BigInteger plaintextPW = new BigInteger(bytesPW);

    //Encrypt the user name and password using e and n calculated above.
    BigInteger encryptedUN = RSA.encryption(plaintextUN, e, n);
    BigInteger encryptedPW = RSA.encryption(plaintextPW, e, n);

    //Print the encrypted username and password as a big int.
    System.out.println("Your encrypted User Name is: " + encryptedUN.toString());
    System.out.println("Your encrypted Password is: " + encryptedPW.toString());

    //Ask for the username, encrypt it and compare to the encrypted username
    // entered before.
    int compareUN;
    do{
      System.out.println("Enter your Username:");
      String loginUN = enter.next();
      byte[] bytesLUN = loginUN.getBytes(StandardCharsets.UTF_8);
      BigInteger LUN = new BigInteger(bytesLUN);
      BigInteger encryptedLUN = RSA.encryption(LUN, e, n);
      compareUN = encryptedLUN.compareTo(encryptedUN);
      if(compareUN != 0) {
        System.out.println("User does not Exist.");
      }

    } while (compareUN != 0);

    //Once the correct user name is entered print this.
    if (compareUN == 0) {
      System.out.println("User Found!");
    }

    //Ask for the password, encrypt it and see if it matches the original
    //password.
    int comparePW;
    do{
      System.out.println("Enter your Password:");
      String loginPW = enter.next();
      byte[] bytesLPW = loginPW.getBytes(StandardCharsets.UTF_8);
      BigInteger LPW = new BigInteger(bytesLPW);
      BigInteger encryptedLPW = RSA.encryption(LPW, e, n);
      comparePW = encryptedLPW.compareTo(encryptedPW);
      if(comparePW != 0) {
        System.out.println("Incorrect Password, please try again.");
      }

    } while (comparePW != 0);

    //Once the correct password is entered print this.
    if (comparePW == 0) {
      System.out.println("Password Correct!");
    }


    //If the enter user name and password match the original user name and
    // password then decrypt the user name and password.
    if (comparePW == 0 && compareUN == 0) {
      BigInteger decryptedUN = RSA.decryption(encryptedUN, d, n);
      BigInteger decryptedPW = RSA.decryption(encryptedPW, d, n);
      System.out.println("Your decrypted User Name is: " + RSA.byteToString(decryptedUN.toByteArray()));
      System.out.println("Your decrypted PW is: " + RSA.byteToString(decryptedPW.toByteArray()));
    }
  }
}
