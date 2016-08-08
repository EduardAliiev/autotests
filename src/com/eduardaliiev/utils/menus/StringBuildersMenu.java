package com.eduardaliiev.utils.menus;

import java.util.Scanner;

public class StringBuildersMenu {
    public static void runnerString() {
        Scanner scanner = new Scanner(System.in);

        labelOfExit:
        while (true) {
            while (true) {
                System.out.println("\n Welcome! Select one of the four programs is necessary to " +
                        "make next choice and Press Enter: \n" +

//                        "\n 10 - Set of sort numbers from smaller to bigger and from bigger to smaller \n" +

                        "\n 0 - Exit");
                int numberOfChoice;
                if (scanner.hasNextInt()) {                    // проверка на вводимое целое число
                    numberOfChoice = scanner.nextInt();

                    switch (numberOfChoice) {
                        case 0:
                            System.out.println("Starting program: " + "Exit");
                            break labelOfExit;

                       /* case 1:
                            System.out.println("Starting program: " + "Even numbers from 2 to 20");
                            EvenNumbersFrom2To20.calculateLoopNumbers();
                            break;*/


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







