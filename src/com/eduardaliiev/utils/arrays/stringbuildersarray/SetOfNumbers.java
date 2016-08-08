package com.eduardaliiev.utils.arrays.stringbuildersarray;

import com.eduardaliiev.utils.arrays.utils.actionswitharray.InputNumbersOfKeyboard;
import com.eduardaliiev.utils.arrays.utils.actionswitharray.TempSortedNumbersBigToSmall;
import com.eduardaliiev.utils.arrays.utils.actionswitharray.TempSortedNumbersSmallToBig;

import java.util.Scanner;

public class SetOfNumbers {

    public static void calculateLoopNumbers() {

        Scanner scanner = new Scanner(System.in);

        InputNumbersOfKeyboard inputNumbersOfKeyboard = new InputNumbersOfKeyboard();              //Вызываем метод ввода значений массива
        int[] arraysNumber = inputNumbersOfKeyboard.inputNumbersOfKeyboard();

        System.out.println(
                "\n 0 - Sotr from smaller to bigger" +
                        "\n 1 - Sotr from bigger to smaller");

        int numberOfExempls = (int) scanner.nextDouble();
        switch (numberOfExempls) {
            case 0:
                System.out.println("MM->BB");
                TempSortedNumbersSmallToBig tempSortedNumbersSmallToBig = new TempSortedNumbersSmallToBig();              //Вызываем метод сортировки чисел от меньшего к большему
                tempSortedNumbersSmallToBig.tempSortSmallToBig(arraysNumber);
                break;

            case 1:
                System.out.println("BB->MM");
                TempSortedNumbersBigToSmall tempSortedNumbersBigToSmall = new TempSortedNumbersBigToSmall();              //Вызываем метод сортировки чисел от большего к меньшему
                tempSortedNumbersBigToSmall.tempSortBigToSmall(arraysNumber);
                break;
            default:
                System.out.println("exitus");
                break;
        }
    }
}

