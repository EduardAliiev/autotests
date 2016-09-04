package com.eduardaliiev.utils.menus;

import com.eduardaliiev.utils.arrays.generics.WordsSorterGenerics;
import com.eduardaliiev.utils.arrays.objectorientedparadigm.polymorphism.RandomArrayCreator;
import com.eduardaliiev.utils.arrays.utils.enums.EnumNumbersOfMenus;

import java.util.Scanner;

public class GenericsMenuHomeTask15 {
    public static void runnerGenerics() {
        Scanner scanner = new Scanner(System.in);
        labelOfExit:
        while (true) {
            EnumNumbersOfMenus selectedValue = null;
            while (true) {
                System.out.println("\n Welcome! Select one of the four programs is necessary to " +
                        "make next choice and Press Enter: \n" +
                        "\n 1 - Use of a method \'Overloaded\'" +
                        "\n 2 - Reads a set of words from and after is entered the word-marker outputs the result\n" +
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
                            System.out.println("Starting program: " + "Use of a method \'Overloaded\'");
                            RandomArrayCreator.overloadedCreate();
                            break;
                        case SECOND:
                            System.out.println("Reads a set of words from and after is entered the word-marker outputs the result");
                            WordsSorterGenerics.genericsCreate();
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
