package com.eduardaliiev.app.arrays.bubblesorted;

import java.util.Arrays;
import java.util.Scanner;

public class BubbleSortEnteredKeyboardArray {

    public static void calculateLoopBubbleSort() {

        Scanner scanner = new Scanner(System.in);
        int j;

        System.out.print("Please, enter size of the arrays: ");

        int size = scanner.nextInt();
        int[] arraysNumber = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.print("Element of the arrays: ");
            arraysNumber[i] = scanner.nextInt();
        }
        System.out.println("\n" + "0 - От меньшего к большему" +
                "\n" + "1 - От большего к меньшему");

        int numberOfExempls = (int) scanner.nextDouble();
        switch (numberOfExempls) {
            case 0:
                System.out.println("BB->MM");
                BubbleSort.calculateLoopBubbleSort();
                break;
            case 1:
                System.out.println("MM->BB");
                BubbleSort.calculateLoopBubbleSort();
                break;
            default:
                System.out.println("exitus");
                break;
        }
        System.out.print("\n" + "Original arrays:" + Arrays.toString(arraysNumber) + "\n ");
        System.out.print("Sorted arrays: ");
    }
}



