package com.eduardaliiev.app.menus;

import com.eduardaliiev.app.arrays.palindrome.FirstPalindromeMethod;
import com.eduardaliiev.app.arrays.palindrome.SecondPalindromeMethod;
import com.eduardaliiev.app.arrays.palindrome.ThirdPalindromeMethod;
import com.eduardaliiev.app.arrays.utils.enums.EnumNumbersOfMenus;

import java.util.Scanner;

public class PalindromeMenuHomeTask7 {
    public static void runPalindrome() {
        Scanner scanner = new Scanner(System.in);
        labelOfExit:
        while (true) {
            EnumNumbersOfMenus selectedValue = null;
            while (true) {
                System.out.println("\n Welcome! Select one of the three programs is necessary to make next choice and Press Enter:\n" +
                        "\n 1 - The first method of to calculate Palindrome" +
                        "\n 2 - The second method of to calculate Palindrome" +
                        "\n 3 - The third method of to calculate Palindrome\n" +
                        "\n 0 - Exit");
                try {
                    String numberOfChoice = String.valueOf(scanner.nextInt());
                    for (EnumNumbersOfMenus value1 : EnumNumbersOfMenus.values()) {
                        if (numberOfChoice.equals(value1.getValue())) {
                            selectedValue = value1;
                            break;
                        }
                    }
                    switch (selectedValue) {
                        case EXIT:
                            System.out.println("Starting program: " + "Exit" + "\n Good luck!!");
                            break labelOfExit;
                        case FIRST:
                            System.out.println("Starting program: " + "The first method of to calculate Palindrome");
                            FirstPalindromeMethod.runPalindrome();
                            break;
                        case SECOND:
                            System.out.println("Starting program: " + "The second method of to calculate Palindrome");
                            SecondPalindromeMethod.runPalindrome();
                            break;
                        case THIRD:
                            System.out.println("Starting program: " + "The third method of to calculate Palindrome");
                            ThirdPalindromeMethod.runPalindrome();
                            break;
                    }
                } catch (IllegalArgumentException e) {
                    System.out.println("Invalid is entered number of choice :(");
                } catch (NullPointerException e) {
                    System.out.println("Sorry!! But this number isn't to select a program. Please try again to make your choice!!");
                }
            }
        }
        System.out.println("\n Oh-yeah!! Program has processed your choice! Good luck!!");
    }
}
