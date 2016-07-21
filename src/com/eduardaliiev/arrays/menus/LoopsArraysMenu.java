package com.eduardaliiev.arrays.menus;


import com.eduardaliiev.arrays.loops.EvenNumbersFrom2To20;
import com.eduardaliiev.arrays.loops.OddNumbersFrom1To99AndBack;
import com.eduardaliiev.arrays.loops.ArrayOfRandomIntegerNumbersFrom0To9;
import com.eduardaliiev.arrays.loops.ArrayOfRandomIntegerMaxMinNumbersFrom0To999;
import com.eduardaliiev.arrays.loops.TwoDimensionalArrayOfRandomIntegerNumbersFrom1To99;

import java.util.Scanner;

public class LoopsArraysMenu {

    public static void runloop() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome! Select one of the four programs is necessary to " +
                "make next choice and Press Enter:" + "\n" +
                "\n" + "1 - Even numbers from 2 to 20" + "\n" + "2 - Odd numbers from 1 to 99 and back" + "\n" + "3 - Array of random integer numbers from 0 to 9" +
                "\n" + "4 - Array of random integer Max/Min numbers from 0 to 999" +
                "\n" + "5 - Two-dimensional array of random integer numbers from 1 to 99" + "\n" + "\n" + "6 - Exit");
        int numberOfChoice = (int) scanner.nextDouble();
        do{
            if (numberOfChoice == 1) {
                System.out.println("Starting program: " + "Even numbers from 2 to 20");
                EvenNumbersFrom2To20.calculateLoopNumbers();
            } else if (numberOfChoice == 2) {
                System.out.println("Starting program: " + "Odd numbers from 1 to 99 and back");
                OddNumbersFrom1To99AndBack.calculateLoopNumbers();
            } else if (numberOfChoice == 3) {
                System.out.println("Starting program: " + "Array of random integer numbers from 0 to 9");
                ArrayOfRandomIntegerNumbersFrom0To9.calculateLoopNumbers();
            } else if (numberOfChoice == 4) {
                System.out.println("Starting program: " + "Array of random integer Max/Min numbers from 0 to 999");
                ArrayOfRandomIntegerMaxMinNumbersFrom0To999.calculateLoopNumbers();
            } else if (numberOfChoice == 5) {
                System.out.println("Starting program: " + "Two-dimensional array of random integer numbers from 1 to 99");
                TwoDimensionalArrayOfRandomIntegerNumbersFrom1To99.calculateLoopNumbers();
            } else if (numberOfChoice == 6) {
                System.out.println("Starting program: " + numberOfChoice);
            } else

                // } else {
                //   System.out.println("You made wrong choice! :( Please try again later!");

                System.out.println("\n" + "Oh-yeah!! Program has worked your choice! Good luck!!");
        } while (numberOfChoice == 0);
        //return;
    }
}

