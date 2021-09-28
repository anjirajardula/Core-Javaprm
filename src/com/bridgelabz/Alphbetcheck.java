package com.bridgelabz;

import java.util.Scanner;

/**
 * @author :Anji Raj Ardula
 * @version :16.0
 * @since : 28/09/2021
 */


public class Alphbetcheck {
    /**
     * Ask User To Enter a Alphabet
     * And Check It Is a Vowel Or Consonant
     * And Print The Alphabet
     */
    public static void main(String[] args) {
        //Welcome Message Added
        System.out.println("A program to check whether the Alphabet is Vowel or Consonant");
        //Ask User To Enter The Alphabet
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a character : ");
        char ch = sc.next().charAt(0);
        System.out.println("Entered Character is : " + ch);
        //If Condition For To Check The Alphabet Is Vowel Or Not
        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
            System.out.println("The Entered Character " + ch + " is Vowel");
        } else {
            System.out.println("The Entered Character " + ch + " is Consonant");
        }
    }
}
