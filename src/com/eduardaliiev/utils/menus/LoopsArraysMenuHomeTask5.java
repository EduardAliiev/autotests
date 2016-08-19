package com.eduardaliiev.utils.menus;

import com.eduardaliiev.utils.arrays.loops.*;

import java.util.Scanner;

public class LoopsArraysMenuHomeTask5 {
    public static void runloop() {
        Scanner scanner = new Scanner(System.in);

        labelOfExit:
        while (true) {
            while (true) {
                System.out.println("\n Welcome! Select one of the four programs is necessary to " +
                        "make next choice and Press Enter: \n" +
                        "\n 1 - Even numbers from 2 to 20" +
                        "\n 2 - Odd numbers from 1 to 99 and back" +
                        "\n 3 - Array of random integer numbers from 0 to 9" +
                        "\n 4 - Array of random integer Max/Min numbers from 0 to 999" +
                        "\n 5 - Two-dimensional array of random integer numbers from 10 to 99" +
                        "\n 6 - Two-dimensional array is aligned on the right side at random integer numbers from 1 to 999\n" +

                        "\n 0 - Exit");
                int numberOfChoice;
                if (scanner.hasNextInt()) {                    // проверка на вводимое целое число
                    numberOfChoice = scanner.nextInt();

                    switch (numberOfChoice) {
                        case 0:
                            System.out.println("Starting program: " + "Exit");
                            break labelOfExit;

                        case 1:
                            System.out.println("Starting program: " + "Even numbers from 2 to 20");
                            EvenNumbersFrom2To20.calculateLoopNumbers();
                            break;
                        case 2:
                            System.out.println("Starting program: " + "Odd numbers from 1 to 99 and back");
                            OddNumbersFrom1To99AndBack.calculateLoopNumbers();
                            break;
                        case 3:
                            System.out.println("Starting program: " + "Array of random integer numbers from 0 to 9");
                            ArrayOfRandomIntegerNumbersFrom0To9.calculateLoopNumbers();
                            break;
                        case 4:
                            System.out.println("Starting program: " + "Array of random integer Max/Min numbers from 0 to 999");
                            ArrayOfRandomIntegerMaxMinNumbersFrom0To999.calculateLoopNumbers();
                            break;
                        case 5:
                            System.out.println("Starting program: " + "Two-dimensional array of random integer numbers from 10 to 99");
                            TwoDimensionalArrayOfRandomIntegerNumbersFrom10To99.calculateLoopNumbers();
                            break;
                        case 6:
                            System.out.println("Starting program: " + "Two-dimensional array is aligned on the right side at random integer numbers from 1 to 999");
                            TwoArrayOfRandomNumberAlignedOnRightFrom1To999.calculateLoopNumbers();
                            break;
                        default:
                            System.out.println("Sorry!! But this number isn't to select a program. Please try again to make your choice!!");
                            break;           //break labelOfExit;           // для выхода из цикла
                    }
                } else {
                    System.out.println("Sorry!! But you have entered isn't an integer number! Please try again.");
                    break;                              // без 'break' программа зацикливается
                }
                System.out.println("\n Oh-yeah!! Program has processed your choice! Good luck!!");
                try {
                    Thread.sleep(2500);              // вариант от идэешки)) задержка при выводе результата на 2,5 сек
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
        }
    }
}






