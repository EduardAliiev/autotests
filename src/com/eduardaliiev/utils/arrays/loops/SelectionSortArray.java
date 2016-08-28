package com.eduardaliiev.utils.arrays.loops;

import java.util.Arrays;

public class SelectionSortArray {

    public static void calculateLoopNumbers() {
        int[] arraysNumber = {62, 84, 32, 5, 7, 14, 17, 55, 2, 13, 100};
        System.out.print("\n" + "Original array:" + Arrays.toString(arraysNumber) +
                " \n ======================================================= \n");
        for (int i = 0; i < arraysNumber.length; i++) {
            int tempNumber = i;
            for (int j = i + 1; j < arraysNumber.length; j++)
                if (arraysNumber[j] < arraysNumber[tempNumber])
                    tempNumber = j;

            int smallNumber = arraysNumber[tempNumber];
            arraysNumber[tempNumber] = arraysNumber[i];
            arraysNumber[i] = smallNumber;
            System.out.print("\t " + arraysNumber[i]);
        }
    }
}


