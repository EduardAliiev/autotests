package com.eduardaliiev.utils.arrays.utils.actionswitharray;

public class TempSortedNumbersBigToSmall {

    public void tempSortBigToSmall(int[] arraysNumber) {
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
        System.out.print("[ ");

        for (i = arraysNumber.length - 1; i >= 0; i--) {
            System.out.print(arraysNumber[i] + " ");
        }
        System.out.print("]");
       // return arraysNumber;
    }
}
