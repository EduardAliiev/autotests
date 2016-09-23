package com.eduardaliiev.app.menus;

import com.eduardaliiev.app.methods.objectorientedparadigm.polymorphism.RandomArrayCreator;
import com.eduardaliiev.app.methods.objectorientedparadigm.polymorphism.bicycle.Bicycle;
import com.eduardaliiev.app.utils.enums.EnumNumbersOfMenus;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ObjectOrientedParadigmMenuHomeTask13 {
    public static void runnerObjectOrientedParadigm() {
        Scanner scanner = new Scanner(System.in);
        labelOfExit:
        while (true) {
            EnumNumbersOfMenus selectedValue;
            while (true) {
                selectedValue = EnumNumbersOfMenus.SKIP;
                System.out.println("\n Welcome! Select one of the four programs is necessary to " +
                        "make next choice and Press Enter: \n" +
                        "\n 1 - Use of a method \'Overloaded\'" +
                        "\n 2 - Random arrays parametrized" +
                        "\n 3 - Bicycle -> CustomBicycle -> BicycleWithRing\n" +
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
                            System.out.println("Random arrays parametrized");
                            // RandomArrayParametrized randomArrayParametrized = new RandomArrayParametrized();
                            RandomArrayCreator.overloadedCreate();
                            break;
                        case THIRD:
                            System.out.println("Starting program: " + "Bicycle -> CustomBicycle -> BicycleWithRing");
                            Bicycle.ride();
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
