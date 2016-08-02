package com.eduardaliiev.utils.palindrome;

import java.util.Scanner;

public class FirstPalindromeMethod {

    public static boolean runPalindrome() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please, enter Palindrome word - ");
        String palindromeOne = scanner.nextLine();
        System.out.println("Palindrome word is \"" + palindromeOne + "\"");

        boolean isPalindrome = true;

        for (int i = 0; i < palindromeOne.length() / 2; i++) {
            isPalindrome = isPalindrome &&
                    (palindromeOne.toLowerCase().charAt(i) == palindromeOne.toLowerCase().charAt
                            (palindromeOne.length() - i -1));
            if (isPalindrome) {
                System.out.println("It's Palindrome - " + isPalindrome);
                return true;
            } else
                System.out.println("Not a palindrome - " + isPalindrome);
            return false;
        }
        return isPalindrome;
    }
}
