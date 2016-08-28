package com.eduardaliiev.utils.menus;

import com.eduardaliiev.utils.arrays.objectorientedparadigm.polymorphism.RandomArrayCreator;
import com.eduardaliiev.utils.arrays.objectorientedparadigm.polymorphism.bicycle.Bicycle;

import java.util.Scanner;

public class ObjectOrientedParadigmMenuHomeTask12 {
    public static void runnerObjectOrientedParadigm() {
        Scanner scanner = new Scanner(System.in);
        labelOfExit:
        while (true) {
            while (true) {
                System.out.println("\n Welcome! Select one of the four programs is necessary to " +
                        "make next choice and Press Enter: \n" +
                        "\n 1 - Use of a method \'Overloaded\'" +
                       // "\n 2 - Enter name of the company\n" +
                        "\n 3 - Bicycle -> CustomBicycle -> BicycleWithRing\n" +

                        "\n 0 - Exit");
                int numberOfChoice;
                if (scanner.hasNextInt()) {                    // проверка на вводимое целое число
                    numberOfChoice = scanner.nextInt();
                    switch (numberOfChoice) {
                        case 0:
                            System.out.println("Starting program: " + "Exit");
                            break labelOfExit;
                        case 1:
                            System.out.println("Starting program: " + "Use of a method \'Overloaded\'");
                            RandomArrayCreator.overloadedCreate();
                            break;
                       /* case 2:
                            System.out.println("Starting program: " + "Enter name of the company");
                            InputDataWhiteCollar.inputData();
                            break;*/
                        case 3:
                            System.out.println("Starting program: " + "Bicycle -> CustomBicycle -> BicycleWithRing");
                            Bicycle.ride();
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
