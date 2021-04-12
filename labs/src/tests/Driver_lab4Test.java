package tests;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

import main.Lab4.AESCipher;
import org.junit.jupiter.api.Test;

public class Driver_lab4Test {
    String error = "An error occurred.";
    
    @Test
    void test1() {
        File input1 = new File("src/tests/lab4data/input.4.1.in");
        File output1 = new File("src/tests/lab4data/input.4.1.ans");

        try (
            Scanner inputReader1 = new Scanner(input1);
            Scanner outputReader1 = new Scanner(output1);
            ){
            ArrayList<String> tempArray = new ArrayList<String>();
            while (outputReader1.hasNextLine()) {
                tempArray.add(outputReader1.nextLine());
            }
            String[] answerArray = tempArray.toArray(new String[0]);
            while (inputReader1.hasNextLine()) {
                assertArrayEquals(answerArray, AESCipher.aesRoundKeys(inputReader1.nextLine()));
            }
        } catch (FileNotFoundException e) {
            System.err.println(error);
            e.printStackTrace();
        }
    }
    @Test
    void test2() {
        File input1 = new File("src/tests/lab4data/input.4.2.in");
        File output1 = new File("src/tests/lab4data/input.4.2.ans");

        try (
            Scanner inputReader1 = new Scanner(input1);
            Scanner outputReader1 = new Scanner(output1);
            ){
            ArrayList<String> tempArray = new ArrayList<String>();
            while (outputReader1.hasNextLine()) {
                tempArray.add(outputReader1.nextLine());
            }
            String[] answerArray = tempArray.toArray(new String[0]);
            while (inputReader1.hasNextLine()) {
                assertArrayEquals(answerArray, AESCipher.aesRoundKeys(inputReader1.nextLine()));
            }
        } catch (FileNotFoundException e) {
            System.err.println(error);
            e.printStackTrace();
        }
    }
    @Test
    void test3() {
        File input1 = new File("src/tests/lab4data/input.4.3.in");
        File output1 = new File("src/tests/lab4data/input.4.3.ans");

        try (
            Scanner inputReader1 = new Scanner(input1);
            Scanner outputReader1 = new Scanner(output1);
            ){
            ArrayList<String> tempArray = new ArrayList<String>();
            while (outputReader1.hasNextLine()) {
                tempArray.add(outputReader1.nextLine());
            }
            String[] answerArray = tempArray.toArray(new String[0]);
            while (inputReader1.hasNextLine()) {
                assertArrayEquals(answerArray, AESCipher.aesRoundKeys(inputReader1.nextLine()));
            }
        } catch (FileNotFoundException e) {
            System.err.println(error);
            e.printStackTrace();
        }
    }
    @Test
    void test4() {
        File input1 = new File("src/tests/lab4data/input.4.4.in");
        File output1 = new File("src/tests/lab4data/input.4.4.ans");

        try (
            Scanner inputReader1 = new Scanner(input1);
            Scanner outputReader1 = new Scanner(output1);
            ){
            ArrayList<String> tempArray = new ArrayList<String>();
            while (outputReader1.hasNextLine()) {
                tempArray.add(outputReader1.nextLine());
            }
            String[] answerArray = tempArray.toArray(new String[0]);
            while (inputReader1.hasNextLine()) {
                assertArrayEquals(answerArray, AESCipher.aesRoundKeys(inputReader1.nextLine()));
            }
        } catch (FileNotFoundException e) {
            System.err.println(error);
            e.printStackTrace();
        }
    }
    @Test
    void test5() {
        File input1 = new File("src/tests/lab4data/input.4.5.in");
        File output1 = new File("src/tests/lab4data/input.4.5.ans");

        try (
            Scanner inputReader1 = new Scanner(input1);
            Scanner outputReader1 = new Scanner(output1);
            ){
            ArrayList<String> tempArray = new ArrayList<String>();
            while (outputReader1.hasNextLine()) {
                tempArray.add(outputReader1.nextLine());
            }
            String[] answerArray = tempArray.toArray(new String[0]);
            while (inputReader1.hasNextLine()) {
                assertArrayEquals(answerArray, AESCipher.aesRoundKeys(inputReader1.nextLine()));
            }
        } catch (FileNotFoundException e) {
            System.err.println(error);
            e.printStackTrace();
        }
    }
    @Test
    void test6() {
        File input1 = new File("src/tests/lab4data/input.4.6.in");
        File output1 = new File("src/tests/lab4data/input.4.6.ans");

        try (
            Scanner inputReader1 = new Scanner(input1);
            Scanner outputReader1 = new Scanner(output1);
            ){
            ArrayList<String> tempArray = new ArrayList<String>();
            while (outputReader1.hasNextLine()) {
                tempArray.add(outputReader1.nextLine());
            }
            String[] answerArray = tempArray.toArray(new String[0]);
            while (inputReader1.hasNextLine()) {
                assertArrayEquals(answerArray, AESCipher.aesRoundKeys(inputReader1.nextLine()));
            }
        } catch (FileNotFoundException e) {
            System.err.println(error);
            e.printStackTrace();
        }
    }
    @Test
    void test7() {
        File input1 = new File("src/tests/lab4data/input.4.7.in");
        File output1 = new File("src/tests/lab4data/input.4.7.ans");

        try (
            Scanner inputReader1 = new Scanner(input1);
            Scanner outputReader1 = new Scanner(output1);
            ){
            ArrayList<String> tempArray = new ArrayList<String>();
            while (outputReader1.hasNextLine()) {
                tempArray.add(outputReader1.nextLine());
            }
            String[] answerArray = tempArray.toArray(new String[0]);
            while (inputReader1.hasNextLine()) {
                assertArrayEquals(answerArray, AESCipher.aesRoundKeys(inputReader1.nextLine()));
            }
        } catch (FileNotFoundException e) {
            System.err.println(error);
            e.printStackTrace();
        }
    }
    @Test
    void test8() {
        File input1 = new File("src/tests/lab4data/input.4.8.in");
        File output1 = new File("src/tests/lab4data/input.4.8.ans");

        try (
            Scanner inputReader1 = new Scanner(input1);
            Scanner outputReader1 = new Scanner(output1);
            ){
            ArrayList<String> tempArray = new ArrayList<String>();
            while (outputReader1.hasNextLine()) {
                tempArray.add(outputReader1.nextLine());
            }
            String[] answerArray = tempArray.toArray(new String[0]);
            while (inputReader1.hasNextLine()) {
                assertArrayEquals(answerArray, AESCipher.aesRoundKeys(inputReader1.nextLine()));
            }
        } catch (FileNotFoundException e) {
            System.err.println(error);
            e.printStackTrace();
        }
    }
    @Test
    void test9() {
        File input1 = new File("src/tests/lab4data/input.4.9.in");
        File output1 = new File("src/tests/lab4data/input.4.9.ans");

        try (
            Scanner inputReader1 = new Scanner(input1);
            Scanner outputReader1 = new Scanner(output1);
            ){
            ArrayList<String> tempArray = new ArrayList<String>();
            while (outputReader1.hasNextLine()) {
                tempArray.add(outputReader1.nextLine());
            }
            String[] answerArray = tempArray.toArray(new String[0]);
            while (inputReader1.hasNextLine()) {
                assertArrayEquals(answerArray, AESCipher.aesRoundKeys(inputReader1.nextLine()));
            }
        } catch (FileNotFoundException e) {
            System.err.println(error);
            e.printStackTrace();
        }
    }
    @Test
    void test10() {
        File input1 = new File("src/tests/lab4data/input.4.10.in");
        File output1 = new File("src/tests/lab4data/input.4.10.ans");

        try (
            Scanner inputReader1 = new Scanner(input1);
            Scanner outputReader1 = new Scanner(output1);
            ){
            ArrayList<String> tempArray = new ArrayList<String>();
            while (outputReader1.hasNextLine()) {
                tempArray.add(outputReader1.nextLine());
            }
            String[] answerArray = tempArray.toArray(new String[0]);
            while (inputReader1.hasNextLine()) {
                assertArrayEquals(answerArray, AESCipher.aesRoundKeys(inputReader1.nextLine()));
            }
        } catch (FileNotFoundException e) {
            System.err.println(error);
            e.printStackTrace();
        }
    }
}
