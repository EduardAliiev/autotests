package com.eduardaliiev.utils.arrays.bubblesorted;

import com.eduardaliiev.utils.arrays.utils.actionswitharray.TempSortedNumbersBigToSmall;
import com.eduardaliiev.utils.arrays.utils.actionswitharray.TempSortedNumbersSmallToBig;

import java.util.Arrays;
import java.util.Scanner;

public class BubbleSort {
    public static void calculateLoopBubbleSort() {
        Scanner scanner = new Scanner(System.in);
        int[] arraysNumber = {62, 84, 32, 5, 7, 14, 17, 55, 2, 13};
        System.out.print("\n" + "Original array:" + Arrays.toString(arraysNumber) + "\n ");

        TempSortedNumbersSmallToBig tempSorted = new TempSortedNumbersSmallToBig();              //Вызываем метод сортировки чисел
        tempSorted.tempSortSmallToBig(arraysNumber);

        System.out.println(" ");

        TempSortedNumbersBigToSmall tempSortedNumbersBigToSmall = new TempSortedNumbersBigToSmall();    //Вызываем метод сортировки чисел от большего к меньшему
        tempSortedNumbersBigToSmall.tempSortBigToSmall(arraysNumber);
    }
}