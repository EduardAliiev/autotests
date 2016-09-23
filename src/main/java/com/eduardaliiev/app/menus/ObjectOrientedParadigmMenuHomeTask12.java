package com.eduardaliiev.app.menus;

import com.eduardaliiev.app.utils.enums.EnumNumbersOfMenus;
import com.eduardaliiev.app.utils.input.InputDataHuman;
import com.eduardaliiev.app.utils.input.InputDataWhiteCollar;

import java.util.Scanner;

public class ObjectOrientedParadigmMenuHomeTask12 {
    public static void runnerObjectOrientedParadigm() {
        Scanner scanner = new Scanner(System.in);
        labelOfExit:
        while (true) {
            EnumNumbersOfMenus selectedValue;
            while (true) {
                selectedValue = EnumNumbersOfMenus.SKIP;
                System.out.println("\n Welcome! Select one of the four programs is necessary to " +
                        "make next choice and Press Enter: \n" +
                        "\n 1 - Enter the name  and the age of human" +
                        "\n 2 - Enter name of the company\n" +
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
                            System.out.println("Starting program: " + "Enter the name  and the age of human");
                            InputDataHuman.inputData();
                            break;
                        case SECOND:
                            System.out.println("Starting program: " + "Enter name of the company");
                            InputDataWhiteCollar.inputData();
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
