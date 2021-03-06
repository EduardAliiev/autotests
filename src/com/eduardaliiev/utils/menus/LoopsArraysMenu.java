package com.eduardaliiev.utils.menus;

import com.eduardaliiev.utils.arrays.loops.*;


import java.util.Scanner;

public class LoopsArraysMenu {
    public static void runloop() {
        // throws InterruptedException {         // задержка при выводе результата на 2,5 сек (2-3)
        Scanner scanner = new Scanner(System.in);
         //labelOfExit:
        //int i = 4;
        while (true) {
            //if (i == 0) break;
            System.out.println("\n Welcome! Select one of the four programs is necessary to " +
                    "make next choice and Press Enter: \n" +
                    "\n 1 - Even numbers from 2 to 20" +
                    "\n 2 - Odd numbers from 1 to 99 and back" +
                    "\n 3 - Array of random integer numbers from 0 to 9" +
                    "\n 4 - Array of random integer Max/Min numbers from 0 to 999" +
                    "\n 5 - Two-dimensional arrays of random integer numbers from 1 to 99" +
                    "\n 6 - Two-dimensional arrays is aligned on the right side at random integer numbers from 1 to 999" +
                    "\n 7 - Bubble sotr from smaller to bigger and from bigger to smaller \n" +
/*
                    "\n 8 - Via keyboard is entered 'Bubble sort from smaller to bigger' arrays \n" +
*/
                    "\n 0 - Exit");
            //int numberOfChoice = (int) scanner.nextDouble();
            int numberOfChoice;
            if (scanner.hasNextInt()) {                    // проверка на вводимое целое число
                numberOfChoice = scanner.nextInt();

                switch (numberOfChoice) {
                    case 0:
                        System.out.println("Starting program: " + "Exit");
                        break;
                   // labelOfExit;

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
                        System.out.println("Starting program: " + "Two-dimensional arrays of random integer numbers from 1 to 99");
                        TwoDimensionalArrayOfRandomIntegerNumbersFrom1To99.calculateLoopNumbers();
                        break;
                    case 6:
                        System.out.println("Starting program: " + "Two-dimensional arrays is aligned on the right side at random integer numbers from 1 to 999");
                        TwoArrayOfRandomNumberAlignedOnRightFram1To999.calculateLoopNumbers();
                        break;
                    case 7:
                        System.out.println("Starting program: " + "Bubble sort from smaller to bigger and from bigger to smaller");
                        BubbleSort.calculateLoopBubbleSort();
                        break;
                /*    case 8:
                        System.out.println("Starting program: " + "Via keyboard is entered 'Bubble sort from smaller to bigger' arrays");
                        BubbleSortEnteredKeyboardArray.calculateLoopBubbleSort();
                        break;*/
                    default:
                        System.out.println("Sorry!! But this number isn't to select a program. Please try again to make your choice!!");
                        break;     //break labelOfExit;           // для выхода из цикла
                }
            } else {
                System.out.println("Sorry!! But you have entered isn't an integer number! Please try again.");
                break;                              // без 'break' программа зацикливается
            }
            System.out.println("\n Oh-yeah!! Program has processed your choice! Good luck!!");
            //Thread.sleep(2500);         // задержка при выводе результата на 2,5 сек (1-3)
      // i--;
        }
    }
}





