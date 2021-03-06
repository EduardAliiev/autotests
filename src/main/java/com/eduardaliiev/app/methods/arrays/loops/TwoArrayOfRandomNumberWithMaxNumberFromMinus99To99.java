package com.eduardaliiev.app.methods.arrays.loops;

import com.eduardaliiev.app.utils.actionswitharray.RandomCalculateTwoArrayNumbers;

public class TwoArrayOfRandomNumberWithMaxNumberFromMinus99To99 {

    public static void calculateLoopNumbers() {
        int arraysNumbers[][] = new int[5][8];

        RandomCalculateTwoArrayNumbers randomCalculateNumbers = new RandomCalculateTwoArrayNumbers();
        randomCalculateNumbers.randomCalculate(arraysNumbers);

        System.out.print("\n");
        System.out.println("=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=");

        int maxNumber = arraysNumbers[0][0];
        for (int r = 0; r < arraysNumbers.length; r++)
            for (int t = 0; t < arraysNumbers[r].length; t++)
                if ((Math.abs(arraysNumbers[r][t])) > Math.abs(maxNumber))
                    maxNumber = arraysNumbers[r][t];           // '>' - MAX positive number; '<' - MAX negative number

        System.out.print("The maximum number = " + maxNumber + "\n");
    }
}


