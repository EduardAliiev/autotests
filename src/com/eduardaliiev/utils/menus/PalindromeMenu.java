package com.eduardaliiev.utils.menus;

import com.eduardaliiev.utils.palindrome.*;

import java.util.Scanner;

public class PalindromeMenu {
    public static void runPalindrome() {
        Scanner scanner = new Scanner(System.in);

        labelOfExit: while (true) {
            System.out.println("\n Welcome! Select one of the three programs is necessary to make next choice and Press Enter:\n" +
                    "\n 1 - The first method of to calculate Palindrome" +
                    "\n 2 - The second method of to calculate Palindrome" +
                    "\n 3 - The third method of to calculate Palindrome\n" +
                    "\n 0 - Exit");
            int numberOfChoice;
            if (scanner.hasNextInt()) {                    // проверка на вводимое целое число
                numberOfChoice = scanner.nextInt();

                switch (numberOfChoice) {
                    case 0:
                        System.out.println("Starting program: " + "Exit" + "\n Good luck!!");
                        break labelOfExit;
                    case 1:
                        System.out.println("Starting program: " + "The first method of to calculate Palindrome");
                        FirstPalindromeMethod.runPalindrome();
                        break;
                    case 2:
                        System.out.println("Starting program: " + "The second method of to calculate Palindrome");
                        SecondPalindromeMethod.runPalindrome();
                        break;
                    case 3:
                        System.out.println("Starting program: " + "The third method of to calculate Palindrome");
                        ThirdPalindromeMethod.runPalindrome();
                        break;

                    default:
                        System.out.println("Sorry!! But this number isn't to select a program. Please try again to make your choice!!");
                        break;     //break labelOfExit;           // для выхода из цикла
                }
            } else {
                System.out.println("Sorry!! But you have entered isn't an integer number! Please try again.");
                break;                              // без 'break' программа зацикливается
            }
            System.out.println("\n Oh-yeah!! Program has processed your choice! Good luck!!");
            try {
                Thread.sleep(2500);         // задержка при выводе результата на 2,5 сек
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
