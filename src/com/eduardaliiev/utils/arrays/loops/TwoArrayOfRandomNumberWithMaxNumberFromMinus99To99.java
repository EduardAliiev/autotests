package com.eduardaliiev.utils.arrays.loops;

import com.eduardaliiev.utils.arrays.utils.actionswitharray.RandomCalculateNumbers;

import java.util.Scanner;

public class TwoArrayOfRandomNumberWithMaxNumberFromMinus99To99 {

    public static void calculateLoopNumbers() {

        Scanner scanner = new Scanner(System.in);
        int arraysNumbers[][] = new int[5][8];

        RandomCalculateNumbers randomCalculateNumbers = new RandomCalculateNumbers();
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


