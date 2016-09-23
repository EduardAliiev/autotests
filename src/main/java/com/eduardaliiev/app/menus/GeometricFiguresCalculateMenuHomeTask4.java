package com.eduardaliiev.app.menus;

import com.eduardaliiev.app.utils.enums.*;
import com.eduardaliiev.app.methods.calculators.*;

import java.util.InputMismatchException;
import java.util.Scanner;

public class GeometricFiguresCalculateMenuHomeTask4 {
    public static void run() {
        Scanner scanner = new Scanner(System.in);
        labelOfExit:
        while (true) {
            EnumNumbersOfMenus selectedValue;
            while (true) {
                selectedValue = EnumNumbersOfMenus.SKIP;
                System.out.println("\n Welcome! Select one of the four programs is necessary to " +
                        "make next choice and Press Enter:\n" +
                        "\n 1 - Circle Area" +
                        "\n 2 - Circle Radius" +
                        "\n 3 - Right Angled Triangle" +
                        "\n 4 - Numbers Is Even Or Odd\n" +
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
                            System.out.println("Starting program: " + "Exit" + "\n Good luck!!");
                            break labelOfExit;
                        case FIRST:
                            System.out.println("Starting program: " + "Circle Area");
                            CircleArea.calculateArea();
                            break;
                        case SECOND:
                            System.out.println("Starting program: " + "Circle Radius");
                            CircleRadius.calculateBigger();
                            break;
                        case THIRD:
                            System.out.println("Starting program: " + "Right Angled Triangle");
                            AngledTriangle.calculateAngledTriangle();
                            break;
                        case FOURTH:
                            System.out.println("Starting program: " + "Numbers Is Even Or Odd");
                            EvenOrOdd.calculateEvenOrOdd();
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

