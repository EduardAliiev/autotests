package com.eduardaliiev.utils.arrays.utils.actionswitharray;

import java.util.Scanner;

public class RandomCalculateNumbers {

    public void randomCalculate(int[][] arraysNumbers) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please, enter boundary [min,max] of the array: \n");
        int minBoundaryNum = scanner.nextInt();                     //ввод минимального значения диапазона массива
        int maxBoundaryNum = scanner.nextInt();                     //ввод максимального значения диапазона массива

        for (int i = 0; i < arraysNumbers.length; i++) {
            System.out.println();
            for (int j = 0; j < arraysNumbers[i].length; j++) {
                arraysNumbers[i][j] = minBoundaryNum + (int) (Math.random() * ((maxBoundaryNum - minBoundaryNum) + 1));     //перебор рамдомных значений в min/max диапозоне
                System.out.printf("%4d  ", arraysNumbers [i][j]);                                                           // f(%4d - выравниваем выводимый массив
            }
        }
    }
}

/*RandomCalculateNumbers randomCalculateNumbers = new RandomCalculateNumbers();
        randomCalculateNumbers.randomCalculate(arraysNumbers);*/