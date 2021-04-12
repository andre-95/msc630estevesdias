package tests;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import main.Lab5.AESCipher;
import org.junit.jupiter.api.Test;

public class Driver_lab5Test {
    String error = "An error occurred.";
    
    @Test
    void test1() {
        File input1 = new File("src/tests/lab5data/input.5.1.in");
        File output1 = new File("src/tests/lab5data/input.5.1.ans");

        try (
            Scanner inputReader1 = new Scanner(input1);
            Scanner outputReader1 = new Scanner(output1);
            ){
            String keyHex = inputReader1.nextLine();
            String pTextHex = inputReader1.nextLine();
            String answer = outputReader1.nextLine();
            assertEquals(answer, AESCipher.AES(pTextHex, keyHex)[0]);
        } catch (FileNotFoundException e) {
            System.err.println(error);
            e.printStackTrace();
        }
    }
    @Test
    void test2() {
        File input1 = new File("src/tests/lab5data/input.5.2.in");
        File output1 = new File("src/tests/lab5data/input.5.2.ans");

        try (
            Scanner inputReader1 = new Scanner(input1);
            Scanner outputReader1 = new Scanner(output1);
            ){
            String keyHex = inputReader1.nextLine();
            String pTextHex = inputReader1.nextLine();
            String answer = outputReader1.nextLine();
            assertEquals(answer, AESCipher.AES(pTextHex, keyHex)[0]);
        } catch (FileNotFoundException e) {
            System.err.println(error);
            e.printStackTrace();
        }
    }
    @Test
    void test3() {
        File input1 = new File("src/tests/lab5data/input.5.3.in");
        File output1 = new File("src/tests/lab5data/input.5.3.ans");

        try (
            Scanner inputReader1 = new Scanner(input1);
            Scanner outputReader1 = new Scanner(output1);
            ){
            String keyHex = inputReader1.nextLine();
            String pTextHex = inputReader1.nextLine();
            String answer = outputReader1.nextLine();
            assertEquals(answer, AESCipher.AES(pTextHex, keyHex)[0]);
        } catch (FileNotFoundException e) {
            System.err.println(error);
            e.printStackTrace();
        }
    }
    @Test
    void test4() {
        File input1 = new File("src/tests/lab5data/input.5.4.in");
        File output1 = new File("src/tests/lab5data/input.5.4.ans");

        try (
            Scanner inputReader1 = new Scanner(input1);
            Scanner outputReader1 = new Scanner(output1);
            ){
            String keyHex = inputReader1.nextLine();
            String pTextHex = inputReader1.nextLine();
            String answer = outputReader1.nextLine();
            assertEquals(answer, AESCipher.AES(pTextHex, keyHex)[0]);
        } catch (FileNotFoundException e) {
            System.err.println(error);
            e.printStackTrace();
        }
    }
    @Test
    void test5() {
        File input1 = new File("src/tests/lab5data/input.5.5.in");
        File output1 = new File("src/tests/lab5data/input.5.5.ans");

        try (
            Scanner inputReader1 = new Scanner(input1);
            Scanner outputReader1 = new Scanner(output1);
            ){
            String keyHex = inputReader1.nextLine();
            String pTextHex = inputReader1.nextLine();
            String answer = outputReader1.nextLine();
            assertEquals(answer, AESCipher.AES(pTextHex, keyHex)[0]);
        } catch (FileNotFoundException e) {
            System.err.println(error);
            e.printStackTrace();
        }
    }
    @Test
    void test6() {
        File input1 = new File("src/tests/lab5data/input.5.6.in");
        File output1 = new File("src/tests/lab5data/input.5.6.ans");

        try (
            Scanner inputReader1 = new Scanner(input1);
            Scanner outputReader1 = new Scanner(output1);
            ){
            String keyHex = inputReader1.nextLine();
            String pTextHex = inputReader1.nextLine();
            String answer = outputReader1.nextLine();
            assertEquals(answer, AESCipher.AES(pTextHex, keyHex)[0]);
        } catch (FileNotFoundException e) {
            System.err.println(error);
            e.printStackTrace();
        }
    }
    @Test
    void test7() {
        File input1 = new File("src/tests/lab5data/input.5.7.in");
        File output1 = new File("src/tests/lab5data/input.5.7.ans");

        try (
            Scanner inputReader1 = new Scanner(input1);
            Scanner outputReader1 = new Scanner(output1);
            ){
            String keyHex = inputReader1.nextLine();
            String pTextHex = inputReader1.nextLine();
            String answer = outputReader1.nextLine();
            assertEquals(answer, AESCipher.AES(pTextHex, keyHex)[0]);
        } catch (FileNotFoundException e) {
            System.err.println(error);
            e.printStackTrace();
        }
    }
    @Test
    void test8() {
        File input1 = new File("src/tests/lab5data/input.5.8.in");
        File output1 = new File("src/tests/lab5data/input.5.8.ans");

        try (
            Scanner inputReader1 = new Scanner(input1);
            Scanner outputReader1 = new Scanner(output1);
            ){
            String keyHex = inputReader1.nextLine();
            String pTextHex = inputReader1.nextLine();
            String answer = outputReader1.nextLine();
            assertEquals(answer, AESCipher.AES(pTextHex, keyHex)[0]);
        } catch (FileNotFoundException e) {
            System.err.println(error);
            e.printStackTrace();
        }
    }
    @Test
    void test9() {
        File input1 = new File("src/tests/lab5data/input.5.9.in");
        File output1 = new File("src/tests/lab5data/input.5.9.ans");

        try (
            Scanner inputReader1 = new Scanner(input1);
            Scanner outputReader1 = new Scanner(output1);
            ){
            String keyHex = inputReader1.nextLine();
            String pTextHex = inputReader1.nextLine();
            String answer = outputReader1.nextLine();
            assertEquals(answer, AESCipher.AES(pTextHex, keyHex)[0]);
        } catch (FileNotFoundException e) {
            System.err.println(error);
            e.printStackTrace();
        }
    }
    @Test
    void test10() {
        File input1 = new File("src/tests/lab5data/input.5.10.in");
        File output1 = new File("src/tests/lab5data/input.5.10.ans");

        try (
            Scanner inputReader1 = new Scanner(input1);
            Scanner outputReader1 = new Scanner(output1);
            ){
            String keyHex = inputReader1.nextLine();
            String pTextHex = inputReader1.nextLine();
            String answer = outputReader1.nextLine();
            assertEquals(answer, AESCipher.AES(pTextHex, keyHex)[0]);
        } catch (FileNotFoundException e) {
            System.err.println(error);
            e.printStackTrace();
        }
    }
}
