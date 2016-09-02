package com.eduardaliiev.utils.menus;

import com.eduardaliiev.utils.arrays.bubblesorted.BubbleSort;
import com.eduardaliiev.utils.arrays.loops.SelectionSortArray;
import com.eduardaliiev.utils.arrays.loops.TwoArrayOfRandomNumberWithMaxNumberFromMinus99To99;
import com.eduardaliiev.utils.arrays.utils.enums.EnumNumbersOfMenus;

import java.util.Scanner;

public class LoopsArraysMenuHomeTask6 {
    public static void runloop() {
        Scanner scanner = new Scanner(System.in);
        labelOfExit:
        while (true) {
            EnumNumbersOfMenus selectedValue = null;
            while (true) {
                System.out.println("\n Welcome! Select one of the four programs is necessary to " +
                        "make next choice and Press Enter: \n" +
                        "\n 1 - Bubble sotr from smaller to bigger and from bigger to smaller" +
                        "\n 2 - Sort array by 'Selection sort'" +
                        "\n 3 - The two-dimensional array with a maximum output of a random number from -99 to 99\n" +
                        "\n 0 - Exit");
                try {
                    String numberOfChoice = String.valueOf(scanner.nextInt());
                    for (EnumNumbersOfMenus value1 : EnumNumbersOfMenus.values()) {
                        if (numberOfChoice.equals(value1.getValue())) {
                            selectedValue = value1;
                            break;
                        }
                    }
                    switch (selectedValue) {
                        case EXIT:
                            System.out.println("Starting program: " + "Exit");
                            break labelOfExit;
                        case FIRST:
                            System.out.println("Starting program: " + "Bubble sort from smaller to bigger and from bigger to smaller");
                            BubbleSort.calculateLoopBubbleSort();
                            break;
                        case SECOND:
                            System.out.println("Starting program: " + "Sort array by 'Selection sort'");
                            SelectionSortArray.calculateLoopNumbers();
                            break;
                        case THIRD:
                            System.out.println("Starting program: " + "The two-dimensional array with a maximum output of a random number from -99 to 99");
                            TwoArrayOfRandomNumberWithMaxNumberFromMinus99To99.calculateLoopNumbers();
                            break;
                    }
                } catch (IllegalArgumentException e) {
                    System.out.println("Invalid is entered number of choice :(");
                } catch (NullPointerException e) {
                    System.out.println("Sorry!! But this number isn't to select a program. Please try again to make your choice!!");
                }
            }
        }
        System.out.println("\n Oh-yeah!! Program has processed your choice! Good luck!!");
    }
}






