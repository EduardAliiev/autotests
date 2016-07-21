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
        //  int A = 5;
        //while (A > 0) {
        System.out.println("Welcome! Select one of the four programs is necessary to " +
                "make next choice and Press Enter:" + "\n" +
                "\n" + "1 - Even numbers from 2 to 20" + "\n" + "2 - Odd numbers from 1 to 99 and back" + "\n" + "3 - Array of random integer numbers from 0 to 9" +
                "\n" + "4 - Array of random integer Max/Min numbers from 0 to 999" +
                "\n" + "5 - Two-dimensional array of random integer numbers from 1 to 99" + "\n" +
                "\n" + "0 - Exit");
        int numberOfChoice = (int) scanner.nextDouble();
        switch (numberOfChoice) {
            case 1:
                EvenNumbersFrom2To20.calculateLoopNumbers();
                break;
            case 2:
                OddNumbersFrom1To99AndBack.calculateLoopNumbers();
                break;
            case 3:
                ArrayOfRandomIntegerNumbersFrom0To9.calculateLoopNumbers();
                break;
            case 4:
                ArrayOfRandomIntegerMaxMinNumbersFrom0To999.calculateLoopNumbers();
                break;
            case 5:
                TwoDimensionalArrayOfRandomIntegerNumbersFrom1To99.calculateLoopNumbers();
                break;
            case 0:
                break;
            default:
                System.out.println("Starting program: " + numberOfChoice);
        }

        System.out.println("\n" + "Oh-yeah!! Program has worked your choice! Good luck!!");

        // A--;
    }
}





