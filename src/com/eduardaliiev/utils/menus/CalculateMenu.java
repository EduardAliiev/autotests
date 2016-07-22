package com.eduardaliiev.utils.menus;

import com.eduardaliiev.utils.calculators.*;
import java.util.Scanner;

public class CalculateMenu {
    public static void run() {
        Scanner scanner = new Scanner(System.in);
        labelOfExit:
        while (true) {
        System.out.println("\n" + "Welcome! Select one of the four programs is necessary to " +
                "make next choice and Press Enter:" + "\n" +
                "\n" + "1 - Circle Area" +
                "\n" + "2 - Circle Radius" +
                "\n" + "3 - Right Angled Triangle" +
                "\n" + "4 - Numbers Is Even Or Odd" + "\n" +
                "\n" + "0 - Exit");
        int numberOfChoice = (int) scanner.nextDouble();
            switch (numberOfChoice) {
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
                case 0:
                    System.out.println("Starting program: " + "Exit" + "\n" + "Good luck!!");
                    break labelOfExit;
                default:
            }
            System.out.println("\n" + "Oh-yeah!! Program has worked your choice! Good luck!!");
        }
    }
}



