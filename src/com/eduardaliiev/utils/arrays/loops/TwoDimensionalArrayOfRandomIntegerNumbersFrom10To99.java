package com.eduardaliiev.utils.arrays.loops;

import java.util.Random;
import java.util.Scanner;

public class TwoDimensionalArrayOfRandomIntegerNumbersFrom10To99 {
    public static void calculateLoopNumbers() {

        Scanner scanner = new Scanner(System.in);
        int arraysNumbers[][] = new int[8][];

        for (int i = 0; i < arraysNumbers.length; i++) {
            arraysNumbers[i] = new int[5];
        }
        for (int i = 0; i < arraysNumbers.length; i++) {
            System.out.println();
            for (int j = 0; j < arraysNumbers[i].length; j++) {
                Random numbers = new Random();
                arraysNumbers[i][j] = numbers.nextInt(99) + 11;
                System.out.print(arraysNumbers[i][j] + "    ");
            }
            //System.out.println();
        }
    }
}


