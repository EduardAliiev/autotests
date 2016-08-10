package com.eduardaliiev.utils.arrays.loops;

import com.eduardaliiev.utils.arrays.utils.actionswitharray.RandomCalculateNumbers;

import java.util.Scanner;

public class TwoDimensionalArrayOfRandomIntegerNumbersFrom10To99 {
    public static void calculateLoopNumbers() {

        Scanner scanner = new Scanner(System.in);
        int arraysNumbers[][] = new int[8][5];

        RandomCalculateNumbers randomCalculateNumbers = new RandomCalculateNumbers();
        randomCalculateNumbers.randomCalculate(arraysNumbers);
    }
}


