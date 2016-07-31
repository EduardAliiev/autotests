package com.eduardaliiev.utils.arrays.loops;

import java.util.Random;
import java.util.Scanner;

public class TwoArrayOfRandomNumberWithMaxNumberFromMinus99To99 {

    public static void calculateLoopNumbers() {

        Scanner scanner = new Scanner(System.in);
        int arraysNumbers[][] = new int[8][];
        for (int i = 0; i < arraysNumbers.length; i++) {
            arraysNumbers[i] = new int[5];
        }
        for (int i = 0; i < arraysNumbers.length; i++) {
            for (int j = 0; j < arraysNumbers[i].length; j++) {
                Random numbers = new Random();
                arraysNumbers[i][j] = numbers.nextInt(199) - 99;            // section of a randome two-dimensional an array of [-99;99]
                System.out.printf("%4d  ", arraysNumbers[i][j]);
            }
            System.out.print("\n");
        }
        System.out.println("=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=");

        int maxNegative = arraysNumbers[0][0];
        for (int r = 0; r < arraysNumbers.length; r++) {
            for (int t = 0; t < arraysNumbers[r].length; t++)
                if (arraysNumbers[r][t] < maxNegative) maxNegative = arraysNumbers[r][t];           // '>' - MAX positive number; '<' - MAX negative number
        }
        System.out.print("The maximum negative number = " + maxNegative + "\n");
    }
}

