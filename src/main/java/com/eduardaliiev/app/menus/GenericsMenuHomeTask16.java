package com.eduardaliiev.app.menus;

import com.eduardaliiev.app.methods.generics.ArraySorterGenerics;
import com.eduardaliiev.app.methods.generics.WordsSorterGenerics;
import com.eduardaliiev.app.utils.enums.EnumNumbersOfMenus;

import java.util.InputMismatchException;
import java.util.Scanner;

public class GenericsMenuHomeTask16 {
    public static void runnerGenerics() {
        Scanner scanner = new Scanner(System.in);
        labelOfExit:
        while (true) {
            EnumNumbersOfMenus selectedValue;
            while (true) {
                selectedValue = EnumNumbersOfMenus.SKIP;
                System.out.println("\n Welcome! Select one of the four programs is necessary to " +
                        "make next choice and Press Enter: \n" +
                        "\n 1 - ArraiSorterGeneriss is sorts an arrays type, which extends Numbers" +
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
                            System.out.println("Starting program: " + "ArraiSorterGeneriss is sorts an arrays type, which extends Numbers");
                            ArraySorterGenerics.genericsCreate();
                            break;
                        case SECOND:
                            System.out.println("Reads a set of words from and after is entered the word-marker outputs the result");
                            WordsSorterGenerics.genericsCreate();
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
