package com.bridgelabz;

import java.util.Scanner;

/**
 * @author :Anji Raj Ardula
 * @version :16.0
 * @since : 28/09/2021
 */

public class Power2 {
    /**
     * Asking user to enter the power value
     * using forloop condition
     * print the value
     */
    public static void main(String[] args) {
        int n, i;
        //Welcome message added
        System.out.println("Welcome to the powers of 2 program");


        //Ask user to print how many powers user want
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of powers you want:");
        n = sc.nextInt();


        //for loop for to print powers of 2
        for (i = 1; i <= n; i++) {
            int pow = (int) (Math.pow(2, n));
            System.out.println("The power of 2 is :" + pow);
        }
    }
}
