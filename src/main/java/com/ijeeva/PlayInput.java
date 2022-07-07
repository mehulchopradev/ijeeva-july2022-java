package com.ijeeva;

import java.util.InputMismatchException;
import java.util.Scanner;

public class PlayInput {

    public static void main(String[] args) {
        // Java program starts execution from here
        System.out.println("Program starts");

        // try with resources block
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Enter a number: ");
            int n = scanner.nextInt();
            System.out.println(n % 2 == 0 ? "Is even" : "Is odd");
        }
        // scanner will be automatically closed!

        /* Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");

        try {
            int n = scanner.nextInt();
            System.out.println(n % 2 == 0 ? "Is even" : "Is odd");
        } finally {
            // set of stmts that must always execute irrespective of whatever happens in the try block
            System.out.println("Scanner closed");
            scanner.close();
        } */

        /* try {
            int n = scanner.nextInt();
            System.out.println(n % 2 == 0 ? "Is even" : "Is odd");
        } catch (InputMismatchException e) {
            e.printStackTrace();
            System.out.println("Please enter a number");
        } /* catch (Exception e) {
            // catch all exception block
        } */

        System.out.println("Program ends");
        // Java program ends execution here
    }
}
