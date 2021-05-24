/**
 * file: RSA.java
 * author: Andre Esteves Dias
 * course: MSCS 630L 711 21S
 * assignment: Project
 * due date: 5/23/2021
 */

import java.math.BigInteger;
import java.util.Random;


public class RSA {

  private BigInteger p;
  private BigInteger q;
  private BigInteger n;
  private BigInteger phi;
  private BigInteger e;
  private BigInteger d;

  /**
   * Generates large prime numbers of size 'b' bit length
   * @param b length of bit.
   * @return primes, a large probably prime number of length b bits
   */
  public static BigInteger primes(int b)  {
    Random rando = new Random();
    BigInteger primes = BigInteger.probablePrime(b, rando);
    return primes;
  }

  /**
   * Generates n, the modulus used to calculate the public and private keys.
   * n=p*q, n equals p multiplied by q, where p and q are large prime numbers.
   * @param p large prime number
   * @param q large prime number
   * @return n the modulus used as part of the public and private keys.
   */
  public static BigInteger genmodulus(BigInteger p, BigInteger q) {
    return p.multiply(q);
  }

  /**
   * Euler totient function used to calculate phi.
   * @param p same large prime number
   * @param q same large prime number
   * @return phi
   */
  public static BigInteger eulerTF(BigInteger p, BigInteger q) {
    BigInteger phi =
            (p.subtract(BigInteger.ONE)).multiply(q.subtract(BigInteger.ONE));
    return phi;
  }

  /**
   * Find e such that 1<e<phi and gcd(e, phi) = 1. We are looking for e, a
   * number that is coprime to phi.
   * @param phi
   * @return e, where e and phi are coprime.
   */
  public static BigInteger e(BigInteger phi) {
    Random rando = new Random();
    BigInteger e = BigInteger.probablePrime(1024, rando);
    while (phi.gcd(e).compareTo(BigInteger.ONE) > 0 && e.compareTo(phi) < 0)
    {
      e.add(BigInteger.ONE);
    }
    return e;
  }

  /**
   * d is the modular multiplicative inverse of e modulo phi.
   * @param e
   * @param phi
   * @return d, modular multiplicative inverse of e modulo(phi)
   */
  public static BigInteger d(BigInteger e, BigInteger phi) {
    return e.modInverse(phi);
  }

  /**
   * Input a BigInteger plaintext, e, and n to encrypt plaintext.
   * @param plaintext BigInteger input to encrypt
   * @param e makes up part of the public key
   * @param n makes up part of the public key
   * @return encrypted plaintext as a BigInteger by using,
   * ((plaintext)^e) * mod (n)
   */
  public static BigInteger encryption(BigInteger plaintext, BigInteger e,
                                      BigInteger n) {
    return plaintext.modPow(e, n);
  }

  /**
   * Input encrypted plaintext number to decrypt.
   * @param plaintext, encrypted message
   * @param d makes up part of the private key
   * @param n makes up part of the private key
   * @return decrypted plaintext as a BigInteger by using,
   * ((encrypted)^d) * mod (n))
   */
  public static BigInteger decryption(BigInteger plaintext, BigInteger d,
                                      BigInteger n) {
    return plaintext.modPow(d, n);
  }

  /**
   * Converts a byte to string
   * @param decString, byte array
   * @return String version of the value byte array.
   */
  public static String byteToString(byte[] decString) {
    String plaintext = new String(decString);
    return plaintext;
  }










}
