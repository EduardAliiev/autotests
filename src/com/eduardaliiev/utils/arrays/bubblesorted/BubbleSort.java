package com.eduardaliiev.utils.arrays.bubblesorted;

import com.eduardaliiev.utils.arrays.utils.actionsinput.InputNumbersOfKeyboard;
import com.eduardaliiev.utils.arrays.utils.actionswitharray.TempSortedNumbersBigToSmall;
import com.eduardaliiev.utils.arrays.utils.actionswitharray.TempSortedNumbersSmallToBig;

public class BubbleSort {
    public static void calculateLoopBubbleSort() {

        InputNumbersOfKeyboard inputNumbersOfKeyboard = new InputNumbersOfKeyboard();              //Вызываем метод с введенными значениями массива
        int[] arraysNumber = inputNumbersOfKeyboard.inputNumbersOfKeyboard();

        TempSortedNumbersSmallToBig tempSorted = new TempSortedNumbersSmallToBig();              //Вызываем метод сортировки чисел
        tempSorted.tempSortSmallToBig(arraysNumber);

        System.out.println(" ");

        TempSortedNumbersBigToSmall tempSortedNumbersBigToSmall = new TempSortedNumbersBigToSmall();    //Вызываем метод сортировки чисел от большего к меньшему
        tempSortedNumbersBigToSmall.tempSortBigToSmall(arraysNumber);
    }
}