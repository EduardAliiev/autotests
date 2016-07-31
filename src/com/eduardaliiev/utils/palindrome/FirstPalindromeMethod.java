package com.eduardaliiev.utils.palindrome;

import java.util.Scanner;

public class FirstPalindromeMethod {

    public static void runPalindrome() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please, enter first Palindrome words - ");
        String palindromeOne = scanner.nextLine();
/*
        if (palindromeOne.equalsIgnoreCase(palindromeOne)) { }
*/
        boolean isPalindrome = true;

        for (int i = 0; i < palindromeOne.length() / 2; i++) {
            isPalindrome = isPalindrome &&
                    (palindromeOne.charAt(i) == palindromeOne.charAt
                            (palindromeOne.length() - i - 1));
            if (isPalindrome)
                System.out.println("PalindromeOne - " + isPalindrome);
            else
                System.out.println("Not palindromeOne - " + isPalindrome);
        }
    }
}
