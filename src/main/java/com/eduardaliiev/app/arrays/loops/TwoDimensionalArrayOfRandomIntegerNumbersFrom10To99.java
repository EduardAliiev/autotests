package com.eduardaliiev.app.arrays.loops;

import com.eduardaliiev.app.arrays.utils.actionswitharray.RandomCalculateTwoArrayNumbers;

public class TwoDimensionalArrayOfRandomIntegerNumbersFrom10To99 {
    public static void calculateLoopNumbers() {
        int arraysNumbers[][] = new int[8][5];

        RandomCalculateTwoArrayNumbers randomCalculateNumbers = new RandomCalculateTwoArrayNumbers();
        randomCalculateNumbers.randomCalculate(arraysNumbers);
    }
}


