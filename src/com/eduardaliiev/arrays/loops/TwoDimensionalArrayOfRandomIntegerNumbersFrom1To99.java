package com.eduardaliiev.arrays.loops;


import java.util.Random;
import java.util.Scanner;

public class TwoDimensionalArrayOfRandomIntegerNumbersFrom1To99 {
    public static void calculateLoopNumbers() {
        Scanner scanner = new Scanner(System.in);
        int arraysNumbers[][] = new int[5][8];

        for (int i = 0; i < arraysNumbers.length; i++) {
            for (int j = 0; j < arraysNumbers.length; j++) {
                arraysNumbers[i][j] = i * j;
                Random numbers = new Random();
                arraysNumbers[i][j] = numbers.nextInt(99);
                System.out.print(arraysNumbers[i][j] + " ");
            }
            System.out.println();
        }
    }
}

