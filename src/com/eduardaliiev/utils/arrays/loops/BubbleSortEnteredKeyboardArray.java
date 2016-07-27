package com.eduardaliiev.utils.arrays.loops;

import java.util.Arrays;
import java.util.Scanner;

public class BubbleSortEnteredKeyboardArray {

    public static void calculateLoopBubbleSort() {
        Scanner scanner = new Scanner(System.in);
        int j;
        boolean swapFlag = true;
        int tempInt;
        System.out.print("Please, enter size of the array: ");

        int size = scanner.nextInt();
        int[] arraysNumber = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.print("Element of the array: ");
            arraysNumber[i] = scanner.nextInt();
        }
        System.out.print("\n" + "Original array:" + Arrays.toString(arraysNumber) + "\n ");
        System.out.print("Sorted array: ");

        for (int i = 0; i < arraysNumber.length; i++) {
            while (swapFlag) {
                swapFlag = false;
                for (j = 0; j < arraysNumber.length - 1; j++) {
                    if (arraysNumber[j] > arraysNumber[j + 1]) {
                        tempInt = arraysNumber[j + 1];
                        arraysNumber[j + 1] = arraysNumber[j];
                        arraysNumber[j] = tempInt;
                        swapFlag = true;
                    }
                }
            }
            System.out.print(arraysNumber[i] + " ");
        }
    }
}

