package com.eduardaliiev.utils.arrays.utils;

public class TempSortedNumbersSmallToBig {

    public int[] tempSortSmallToBig(int[] arraysNumber) {
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
            System.out.print(arraysNumber[i] + " ");
        }
        return arraysNumber;
    }
}
