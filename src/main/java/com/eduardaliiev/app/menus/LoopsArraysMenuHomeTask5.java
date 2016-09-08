package com.eduardaliiev.app.menus;

import com.eduardaliiev.app.arrays.loops.*;
import com.eduardaliiev.app.arrays.utils.enums.EnumNumbersOfMenus;

import java.util.InputMismatchException;
import java.util.Scanner;

public class LoopsArraysMenuHomeTask5 {
    public static void runloop() {
        Scanner scanner = new Scanner(System.in);
        labelOfExit:
        while (true) {
            EnumNumbersOfMenus selectedValue;
            while (true) {
                selectedValue = EnumNumbersOfMenus.SKIP;
                System.out.println("\n Welcome! Select one of the four programs is necessary to " +
                        "make next choice and Press Enter: \n" +
                        "\n 1 - Even numbers from 2 to 20" +
                        "\n 2 - Odd numbers from 1 to 99 and back" +
                        "\n 3 - Array of random integer numbers from 0 to 9" +
                        "\n 4 - Array of random integer Max/Min numbers from 0 to 999" +
                        "\n 5 - Two-dimensional array of random integer numbers from 10 to 99" +
                        "\n 6 - Two-dimensional array is aligned on the right side at random integer numbers from 1 to 999\n" +
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
                            System.out.println("Starting program: " + "Exit");
                            break labelOfExit;

                        case FIRST:
                            System.out.println("Starting program: " + "Even numbers from 2 to 20");
                            EvenNumbersFrom2To20.calculateLoopNumbers();
                            break;
                        case SECOND:
                            System.out.println("Starting program: " + "Odd numbers from 1 to 99 and back");
                            OddNumbersFrom1To99AndBack.calculateLoopNumbers();
                            break;
                        case THIRD:
                            System.out.println("Starting program: " + "Array of random integer numbers from 0 to 9");
                            ArrayOfRandomIntegerNumbersFrom0To9.calculateLoopNumbers();
                            break;
                        case FOURTH:
                            System.out.println("Starting program: " + "Array of random integer Max/Min numbers from 0 to 999");
                            ArrayOfRandomIntegerMaxMinNumbersFrom0To999.calculateLoopNumbers();
                            break;
                        case FIFTH:
                            System.out.println("Starting program: " + "Two-dimensional array of random integer numbers from 10 to 99");
                            TwoDimensionalArrayOfRandomIntegerNumbersFrom10To99.calculateLoopNumbers();
                            break;
                        case SIXTH:
                            System.out.println("Starting program: " + "Two-dimensional array is aligned on the right side at random integer numbers from 1 to 999");
                            TwoArrayOfRandomNumberAlignedOnRightFrom1To999.calculateLoopNumbers();
                            break;
                        case SKIP:
                            System.out.println("Sorry!! But this number isn't to select a program. Please try again to make your choice!!");
                            break;
                    }
                } catch (IllegalArgumentException e) {
                    System.out.println("Invalid is entered number of choice :(");
                    scanner.next();
                } catch (InputMismatchException e) {
                    System.out.println("Sorry!! But this number isn't to select a program. Please try again to make your choice!!");
                    scanner.next();
                }
            }
        }
        System.out.println("\n Oh-yeah!! Program has processed your choice! Good luck!!");
    }
}







