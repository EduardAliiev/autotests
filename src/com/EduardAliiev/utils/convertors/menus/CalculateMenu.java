package com.EduardAliiev.utils.convertors.menus;

import com.EduardAliiev.utils.convertors.calculators.*;
import java.util.Scanner;

public class CalculateMenu {

    public static void run() {

                Scanner scanner = new
                        Scanner(System.in);
                System.out.println("Welcome! Select one of the four programs is necessary to make next choice and Press Enter:" +
                        "\n" + "1 - Circle Area" + "\n" + "2 - Circle Radius" + "\n" + "3 - Right Angled Triangle" +
                        "\n" + "4 - Numbers Is Even Or Odd");
                double numberOfChoice = scanner.nextDouble();

        do {
                if (numberOfChoice == 1) {
                    CircleArea.calculateArea();
                    break;
                } else if (numberOfChoice == 2) {
                    CircleRadius.calculateBigger();
                    break;
                } else if (numberOfChoice == 3) {
                    AngledTriangle.calculateAngledTriangle();
                    break;
                } else if (numberOfChoice == 4) {
                    EvenOrOdd.calculateEvenOrOdd();
                    break;
                } else
                    System.out.println("You made wrong choice! :( Please try again later!");
                    return;
        } while (numberOfChoice != 0);
                System.out.println("Oh-yeah!! program has worked your choice! Good luck!!");

    }

}




