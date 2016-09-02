package com.eduardaliiev.utils.menus;

import com.eduardaliiev.utils.arrays.stringbuildersarray.ArrayOfCharDataWithDelimiter;
import com.eduardaliiev.utils.arrays.stringbuildersarray.SetOfNumbers;
import com.eduardaliiev.utils.arrays.stringbuildersarray.StringKeyWord;
import com.eduardaliiev.utils.arrays.utils.enums.EnumNumbersOfMenus;
import com.eduardaliiev.utils.arrays.utils.input.InputMethodeEnigma;

import java.io.IOException;
import java.util.Scanner;

public class StringBuildersMenuHomeTask9 {
    public static void runnerString() {
        Scanner scanner = new Scanner(System.in);
        labelOfExit:
        while (true) {
            EnumNumbersOfMenus selectedValue = null;
            while (true) {
                System.out.println("\n Welcome! Select one of the four programs is necessary to " +
                        "make next choice and Press Enter: \n" +
                        "\n 1 - Set of sort numbers from smaller to bigger and from bigger to smaller" +
                        "\n 2 - Enter the value of the array through the delimiter " +
                        "\n 3 - Enter a string and specify the keyword" +
                        "\n 4 - Enigma\n" +
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
                            System.out.println("Starting program: " + "Set of sort numbers from smaller to bigger and from bigger to smaller");
                            try {
                                SetOfNumbers.calculateLoopNumbers();
                            } catch (IOException e) {
                                e.printStackTrace();
                            }
                            break;
                        case SECOND:
                            System.out.println("Starting program: " + "Enter the value of the array through the delimiter \";\"");
                            ArrayOfCharDataWithDelimiter.stringBuilders();
                            break;
                        case THIRD:
                            System.out.println("Starting program: " + "Enter a string and specify the keyword");
                            StringKeyWord.stringBuilders();
                            break;
                        case FOURTH:
                            System.out.println("Starting program: " + "Enigma");
                            InputMethodeEnigma.inputMethodeEnigma();
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







