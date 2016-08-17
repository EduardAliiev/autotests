package com.eduardaliiev.utils.menus;

import com.eduardaliiev.utils.arrays.bubblesorted.BubbleSort;
import com.eduardaliiev.utils.arrays.loops.*;

import java.util.Scanner;

public class LoopsArraysMenuHomeTask6 {
    public static void runloop() {
        Scanner scanner = new Scanner(System.in);

        labelOfExit:
        while (true) {
            while (true) {
                System.out.println("\n Welcome! Select one of the four programs is necessary to " +
                        "make next choice and Press Enter: \n" +
                        "\n 1 - Bubble sotr from smaller to bigger and from bigger to smaller" +
                        "\n 2 - Sort array by 'Selection sort'" +
                        "\n 3 - The two-dimensional array with a maximum output of a random number from -99 to 99\n" +

                        "\n 0 - Exit");
                int numberOfChoice;
                if (scanner.hasNextInt()) {                    // проверка на вводимое целое число
                    numberOfChoice = scanner.nextInt();

                    switch (numberOfChoice) {
                        case 0:
                            System.out.println("Starting program: " + "Exit");
                            break labelOfExit;
                        case 1:
                            System.out.println("Starting program: " + "Bubble sort from smaller to bigger and from bigger to smaller");
                            BubbleSort.calculateLoopBubbleSort();
                            break;
                        case 2:
                            System.out.println("Starting program: " + "Sort array by 'Selection sort'");
                            SelectionSortArray.calculateLoopNumbers();
                            break;
                        case 3:
                            System.out.println("Starting program: " + "The two-dimensional array with a maximum output of a random number from -99 to 99");
                            TwoArrayOfRandomNumberWithMaxNumberFromMinus99To99.calculateLoopNumbers();
                            break;
                        default:
                            System.out.println("Sorry!! But this number isn't to select a program. Please try again to make your choice!!");
                            break;           //break labelOfExit;           // для выхода из цикла
                    }
                } else {
                    System.out.println("Sorry!! But you have entered isn't an integer number! Please try again.");
                    break;                              // без 'break' программа зацикливается
                }
                System.out.println("\n Oh-yeah!! Program has processed your choice! Good luck!!");
                try {
                    Thread.sleep(2500);              // вариант от идэешки)) задержка при выводе результата на 2,5 сек
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}







