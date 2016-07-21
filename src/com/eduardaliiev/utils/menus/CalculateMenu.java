package com.eduardaliiev.utils.menus;

import com.eduardaliiev.utils.calculators.*;
import java.util.Scanner;

public class CalculateMenu {

    public static void run() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome! Select one of the four programs is necessary to " +
                "make next choice and Press Enter:" + "\n" +
                "\n" + "1 - Circle Area" + "\n" + "2 - Circle Radius" + "\n" + "3 - Right Angled Triangle" +
                "\n" + "4 - Numbers Is Even Or Odd" + "\n" + "\n" + "5 - Exit");
        int numberOfChoice = (int) scanner.nextDouble();
        do{
            if (numberOfChoice == 1) {
                System.out.println("Starting program: " + "Circle Area");
                CircleArea.calculateArea();
            } else if (numberOfChoice == 2) {
                System.out.println("Starting program: " + "Circle Radius");
                CircleRadius.calculateBigger();
            } else if (numberOfChoice == 3) {
                System.out.println("Starting program: " + "Right Angled Triangle");
                AngledTriangle.calculateAngledTriangle();
            } else if (numberOfChoice == 4) {
                System.out.println("Starting program: " + "Numbers Is Even Or Odd");
                EvenOrOdd.calculateEvenOrOdd();
            } else if (numberOfChoice == 5) {
                System.out.println("Starting program: " + "Exit");
            } else

                // } else {
                //   System.out.println("You made wrong choice! :( Please try again later!");
                System.out.println("\n" + "Oh-yeah!! Program has worked your choice! Good luck!!");

        } while (numberOfChoice == 0);
            //return;
        }
    }



