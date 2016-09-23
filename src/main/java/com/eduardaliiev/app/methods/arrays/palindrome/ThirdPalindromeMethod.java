package com.eduardaliiev.app.methods.arrays.palindrome;

import java.util.Scanner;

public class ThirdPalindromeMethod {
    public static void runPalindrome() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Please, enter the word for checking: ");
        String palendromeThree = scan.nextLine();
        System.out.println("Palindrome word is \"" + palendromeThree + "\"");

        char[] palendromeArray = palendromeThree.toLowerCase().toCharArray();
        System.out.println("Palindrome - " + itsPalindrome(palendromeArray));
    }

    private static boolean itsPalindrome(char[] palendromeThree) {
        boolean palindrome = false;
        if (palendromeThree.length % 2 == 0) {
            for (int i = 0; i < palendromeThree.length / 2; i++) {
                if (palendromeThree[i] != palendromeThree[palendromeThree.length - i - 1]) {
                    return false;
                } else {
                    palindrome = true;
                }
            }
        } else {
            for (int i = 0; i < (palendromeThree.length - 1) / 2; i++) {
                if (palendromeThree[i] != palendromeThree[palendromeThree.length - i - 1]) {
                    return false;
                } else {
                    palindrome = true;
                }
            }
        }
        return palindrome;
    }
}

