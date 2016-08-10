package com.eduardaliiev.utils.arrays.loops;

import com.eduardaliiev.utils.arrays.utils.actionswitharray.RandomCalculateNumbers;

import java.util.Scanner;

public class TwoArrayOfRandomNumberAlignedOnRightFrom1To999 {
    public static void calculateLoopNumbers() {

        Scanner scanner = new Scanner(System.in);
        int arraysNumbers[][] = new int[8][];
        for (int i = 0; i < arraysNumbers.length; i++) {
            arraysNumbers[i] = new int[5];
        }
        RandomCalculateNumbers randomCalculateNumbers = new RandomCalculateNumbers();
        randomCalculateNumbers.randomCalculate(arraysNumbers);
    }
}
