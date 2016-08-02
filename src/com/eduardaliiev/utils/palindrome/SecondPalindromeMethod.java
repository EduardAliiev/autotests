package com.eduardaliiev.utils.palindrome;

import java.util.Scanner;

public class SecondPalindromeMethod {
    public static void runPalindrome() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please, enter the word for checking: ");
        String palindromeTwo = scanner.nextLine();                // считывание вводимого слова
        System.out.println("Palindrome word is \"" + palindromeTwo + "\"");        // считываем слово которое ввели

        String palindromeTwoNew = new StringBuffer(palindromeTwo).reverse().toString();   // "отзеркаливаем" введенное слово
        if (palindromeTwo.toLowerCase().equals(palindromeTwoNew.toLowerCase())) {               // сравниваем два слова (String)
            System.out.println("It's a Palindrome!");
        } else
        //if (palindromeOne != palindromeOneNew)
            {
            System.out.println("Not a palindrome :(");
        }
    }
}