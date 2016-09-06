package com.eduardaliiev.app.arrays.utils.actionswitharray;

import java.io.IOException;

public class TempSortedNumbersBigToSmall {

    public static int[] tempSortBigToSmall(int[] arraysNumber) throws IOException {

        boolean swapFlag = true;
        int tempInt, i;
        while (swapFlag) {
            swapFlag = false;
            for (i = 0; i < arraysNumber.length - 1; i++) {
                if (arraysNumber[i] > arraysNumber[i + 1]) {
                    tempInt = arraysNumber[i + 1];
                    arraysNumber[i + 1] = arraysNumber[i];
                    arraysNumber[i] = tempInt;
                    swapFlag = true;
                }
            }
        }
        System.out.print("[ ");

        for (i = arraysNumber.length - 1; i >= 0; i--) {
            System.out.print(arraysNumber[i] + " ");
        }
        System.out.println("]");
        return arraysNumber;
    }
}
