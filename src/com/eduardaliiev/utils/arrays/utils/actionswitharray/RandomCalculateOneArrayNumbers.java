package com.eduardaliiev.utils.arrays.utils.actionswitharray;

import java.util.Scanner;

public class RandomCalculateOneArrayNumbers {

    public void randomCalculate(int[] arraysNumbers) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please, enter boundary [min,max] of the array: \n");
        int minBoundaryNum = scanner.nextInt();                     //ввод минимального значения диапазона массива
        int maxBoundaryNum = scanner.nextInt();                     //ввод максимального значения диапазона массива

        for (int i = 0; i < arraysNumbers.length; i++) {
            arraysNumbers[i] = minBoundaryNum + (int) (Math.random() * ((maxBoundaryNum - minBoundaryNum) + 1));     //перебор рамдомных значений в min/max диапозоне
            System.out.printf("%4d  ", arraysNumbers[i]);                                                           // f(%4d - выравниваем выводимый массив
        }
    }
}