package com.eduardaliiev.app.methods.arrays.bubblesorted;

import com.eduardaliiev.app.utils.actionswitharray.TempSortedNumbersBigToSmall;
import com.eduardaliiev.app.utils.actionswitharray.TempSortedNumbersSmallToBig;
import com.eduardaliiev.app.utils.input.InputNumbersOfKeyboard;

import java.io.IOException;

public class BubbleSort {
    public static void calculateLoopBubbleSort() {

        InputNumbersOfKeyboard inputNumbersOfKeyboard = new InputNumbersOfKeyboard();              //Вызываем метод с введенными значениями массива
        int[] arraysNumber = inputNumbersOfKeyboard.inputNumbersOfKeyboard();

        TempSortedNumbersSmallToBig tempSorted = new TempSortedNumbersSmallToBig();              //Вызываем метод сортировки чисел
        tempSorted.tempSortSmallToBig(arraysNumber);

        System.out.println(" ");

        TempSortedNumbersBigToSmall tempSortedNumbersBigToSmall = new TempSortedNumbersBigToSmall();    //Вызываем метод сортировки чисел от большего к меньшему
        try {
            tempSortedNumbersBigToSmall.tempSortBigToSmall(arraysNumber);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}