package com.eduardaliiev.app.menus;

import com.eduardaliiev.app.methods.arrays.bubblesorted.BubbleSort;
import com.eduardaliiev.app.methods.arrays.loops.SelectionSortArray;
import com.eduardaliiev.app.methods.arrays.loops.TwoArrayOfRandomNumberWithMaxNumberFromMinus99To99;
import com.eduardaliiev.app.utils.enums.EnumNumbersOfMenus;

import java.util.InputMismatchException;
import java.util.Scanner;

public class LoopsArraysMenuHomeTask6 {
    public static void runloop() {
        Scanner scanner = new Scanner(System.in);
        labelOfExit:
        while (true) {
            EnumNumbersOfMenus selectedValue;
            while (true) {
                selectedValue = EnumNumbersOfMenus.SKIP;
                System.out.println("\n Welcome! Select one of the four programs is necessary to " +
                        "make next choice and Press Enter: \n" +
                        "\n 1 - Bubble sotr from smaller to bigger and from bigger to smaller" +
                        "\n 2 - Sort arrays by 'Selection sort'" +
                        "\n 3 - The two-dimensional arrays with a maximum output of a random number from -99 to 99\n" +
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
                            System.out.println("Starting program: " + "Sort arrays by 'Selection sort'");
                            SelectionSortArray.calculateLoopNumbers();
                            break;
                        case THIRD:
                            System.out.println("Starting program: " + "The two-dimensional arrays with a maximum output of a random number from -99 to 99");
                            TwoArrayOfRandomNumberWithMaxNumberFromMinus99To99.calculateLoopNumbers();
                            break;
                        case SKIP:
                            System.out.println("Sorry!! But this number isn't to select a program. Please try again to make your choice!!");
                            break;
                    }
                } catch (IllegalArgumentException e) {
                    System.out.println("Invalid is entered number of choice :(");
                    scanner.next();
                } catch (InputMismatchException e) {
                    System.out.println("Sorry!! But this number isn't to select a program. Please try again to make your choice!!");
                    scanner.next();
                }
            }
        }
        System.out.println("\n Oh-yeah!! Program has processed your choice! Good luck!!");
    }
}






