package com.eduardaliiev.utils.arrays.utils;

public class TempSortedNumbersBigToSmall {

    public int[] tempSortBigToSmall(int[] arraysNumber) {
        boolean swapFlag = true;
        int tempInt;
        int i;
        while (swapFlag) {
            swapFlag = false;
            for (i = 0; i < arraysNumber.length-1; i++) {
                if (arraysNumber[i] > arraysNumber[i + 1]) {
                    tempInt = arraysNumber[i + 1];
                    arraysNumber[i + 1] = arraysNumber[i];
                    arraysNumber[i] = tempInt;
                    swapFlag = true;
                }
            }
        }
        for (i = arraysNumber.length - 1; i >= 0; i--) {
            // System.out.print("Sorted from bigger to smaller:");
            System.out.print(arraysNumber[i] + " ");
        }
        return arraysNumber;
    }
}
