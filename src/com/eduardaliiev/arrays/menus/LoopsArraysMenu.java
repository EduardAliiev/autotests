package com.eduardaliiev.arrays.menus;

import com.eduardaliiev.arrays.loops.EvenNumbersFrom2To20;
import com.eduardaliiev.arrays.loops.OddNumbersFrom1To99AndBack;
import com.eduardaliiev.arrays.loops.ArrayOfRandomIntegerNumbersFrom0To9;
import com.eduardaliiev.arrays.loops.ArrayOfRandomIntegerMaxMinNumbersFrom0To999;
import com.eduardaliiev.arrays.loops.TwoDimensionalArrayOfRandomIntegerNumbersFrom1To99;
import com.eduardaliiev.arrays.loops.BubbleSort;


import java.util.Scanner;

public class LoopsArraysMenu {
    public static void runloop()
            throws InterruptedException {         // задержка при выводе результата на 2,5 сек (2-3)
        Scanner scanner = new Scanner(System.in);
        labelOfExit:
        while (true) {
            System.out.println("\n" + "Welcome! Select one of the four programs is necessary to " +
                    "make next choice and Press Enter:" + "\n" +
                    "\n" + "1 - Even numbers from 2 to 20" +
                    "\n" + "2 - Odd numbers from 1 to 99 and back" +
                    "\n" + "3 - Array of random integer numbers from 0 to 9" +
                    "\n" + "4 - Array of random integer Max/Min numbers from 0 to 999" +
                    "\n" + "5 - Two-dimensional array of random integer numbers from 1 to 99" +
                    "\n" + "6 - Bubble sotr from smaller to bigger and from bigger to smaller" + "\n" +
                    "\n" + "0 - Exit");
            int numberOfChoice = (int) scanner.nextDouble();
            switch (numberOfChoice) {
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
                    System.out.println("Starting program: " + "Two-dimensional array of random integer numbers from 1 to 99");
                    TwoDimensionalArrayOfRandomIntegerNumbersFrom1To99.calculateLoopNumbers();
                    break;
                case 6:
                    System.out.println("Starting program: " + "Bubble sotr from smaller to bigger and from bigger to smaller");
                    BubbleSort.calculateLoopBubbleSort();
                    break;
                case 0:
                    System.out.println("Starting program: " + "Exit");
                    break labelOfExit;
                default:
                    System.out.println("Sorry!! But this number isn't to select a program. Please try again to make your choice!!");
                    break;     //break labelOfExit;           // для выхода из цикла
            }
            System.out.println("\n" + "Oh-yeah!! Program has worked your choice! Good luck!!");
        Thread.sleep(2500);         // задержка при выводе результата на 2,5 сек (1-3)
        }

    }
}





