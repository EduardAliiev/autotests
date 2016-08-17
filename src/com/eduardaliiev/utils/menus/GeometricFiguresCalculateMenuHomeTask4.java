package com.eduardaliiev.utils.menus;

import com.eduardaliiev.utils.calculators.*;

import java.util.Scanner;

public class GeometricFiguresCalculateMenuHomeTask4 {
    public static void run() {
        Scanner scanner = new Scanner(System.in);

        labelOfExit: while (true) {
            System.out.println("\n Welcome! Select one of the four programs is necessary to " +
                    "make next choice and Press Enter:\n" +
                    "\n 1 - Circle Area" +
                    "\n 2 - Circle Radius" +
                    "\n 3 - Right Angled Triangle" +
                    "\n 4 - Numbers Is Even Or Odd\n" +
                    "\n 0 - Exit");
            //int numberOfChoice = (int) scanner.nextDouble();
            int numberOfChoice;
            if (scanner.hasNextInt()) {                    // проверка на вводимое целое число
                numberOfChoice = scanner.nextInt();

                switch (numberOfChoice) {
                    case 0:
                        System.out.println("Starting program: " + "Exit" + "\n Good luck!!");
                        break labelOfExit;
                    case 1:
                        System.out.println("Starting program: " + "Circle Area");
                        CircleArea.calculateArea();
                        break;
                    case 2:
                        System.out.println("Starting program: " + "Circle Radius");
                        CircleRadius.calculateBigger();
                        break;
                    case 3:
                        System.out.println("Starting program: " + "Right Angled Triangle");
                        AngledTriangle.calculateAngledTriangle();
                        break;
                    case 4:
                        System.out.println("Starting program: " + "Numbers Is Even Or Odd");
                        EvenOrOdd.calculateEvenOrOdd();
                        break;
                    default:
                        System.out.println("Sorry!! But this number isn't to select a program. Please try again to make your choice!!");
                        break;     //break labelOfExit;           // для выхода из цикла
                }
            } else {
                System.out.println("Sorry!! But you have entered isn't an integer number! Please try again.");
                break;                              // без 'break' программа зацикливается
            }
            System.out.println("\n Oh-yeah!! Program has processed your choice! Good luck!!");
            try {
                Thread.sleep(2500);         // задержка при выводе результата на 2,5 сек
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}



