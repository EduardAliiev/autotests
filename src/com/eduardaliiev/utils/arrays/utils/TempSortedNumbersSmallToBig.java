package com.eduardaliiev.utils.arrays.utils;

import java.util.Arrays;

public class TempSortedNumbersSmallToBig {

    public void tempSortSmallToBig(int[] arraysNumber) {
        boolean swapFlag = true;
        int tempInt;
        int i;
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
        for (i = 0; i < arraysNumber.length; i++) {
            arraysNumber[i] = Integer.valueOf(arraysNumber[i]);
        }
            System.out.print(Arrays.toString(arraysNumber));

//        return arraysNumber;
    }
}
