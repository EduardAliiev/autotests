package com.eduardaliiev.app.arrays.loops;

import com.eduardaliiev.app.arrays.utils.actionswitharray.RandomCalculateTwoArrayNumbers;

public class TwoArrayOfRandomNumberAlignedOnRightFrom1To999 {
    public static void calculateLoopNumbers() {
        int arraysNumbers[][] = new int[8][];
        for (int i = 0; i < arraysNumbers.length; i++) {
            arraysNumbers[i] = new int[5];
        }
        RandomCalculateTwoArrayNumbers randomCalculateNumbers = new RandomCalculateTwoArrayNumbers();
        randomCalculateNumbers.randomCalculate(arraysNumbers);
    }
}
