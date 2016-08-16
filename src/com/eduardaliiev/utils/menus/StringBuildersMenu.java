package com.eduardaliiev.utils.menus;

import com.eduardaliiev.utils.arrays.stringbuildersarray.ArrayOfCharDataWithDelimiter;
import com.eduardaliiev.utils.arrays.stringbuildersarray.SetOfNumbers;
import com.eduardaliiev.utils.arrays.stringbuildersarray.StringKeyWord;
import com.eduardaliiev.utils.arrays.enigma.InputMethodeEnigma;

import java.util.Scanner;

public class StringBuildersMenu {
    public static void runnerString() {
        Scanner scanner = new Scanner(System.in);

        labelOfExit:
        while (true) {
            while (true) {
                System.out.println("\n Welcome! Select one of the four programs is necessary to " +
                        "make next choice and Press Enter: \n" +
                        "\n 1 - Set of sort numbers from smaller to bigger and from bigger to smaller" +
                        "\n 2 - Enter the value of the array through the delimiter " +
                        "\n 3 - Enter a string and specify the keyword" +
                        "\n 4 - Enigma\n" +
                        "\n 0 - Exit");
                int numberOfChoice;
                if (scanner.hasNextInt()) {                    // проверка на вводимое целое число
                    numberOfChoice = scanner.nextInt();
                    switch (numberOfChoice) {
                        case 0:
                            System.out.println("Starting program: " + "Exit");
                            break labelOfExit;
                        case 1:
                            System.out.println("Starting program: " + "Set of sort numbers from smaller to bigger and from bigger to smaller");
                            SetOfNumbers.calculateLoopNumbers();
                            break;
                        case 2:
                            System.out.println("Starting program: " + "Enter the value of the array through the delimiter \";\"");
                            ArrayOfCharDataWithDelimiter.stringBuilders();
                            break;
                        case 3:
                            System.out.println("Starting program: " + "Enter a string and specify the keyword");
                            StringKeyWord.stringBuilders();
                            break;
                        case 4:
                            System.out.println("Starting program: " + "Enigma");
                            InputMethodeEnigma.inputMethodeEnigma();
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







