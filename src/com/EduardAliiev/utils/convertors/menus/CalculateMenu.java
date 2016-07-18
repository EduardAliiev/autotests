package com.EduardAliiev.utils.convertors.menus;

import com.EduardAliiev.utils.convertors.calculators.*;
import java.util.Scanner;

public class CalculateMenu {

    public static void run() {

                Scanner scanner = new
                        Scanner(System.in);
                System.out.println("Welcome! Select one of the four programs is necessary to " +
                        "make next choice and Press Enter:" + "\n" +
                        "\n" + "1 - Circle Area" + "\n" + "2 - Circle Radius" + "\n" + "3 - Right Angled Triangle" +
                        "\n" + "4 - Numbers Is Even Or Odd");
                double numberOfChoice = scanner.nextDouble();

        do {
                if (numberOfChoice == 1) {
                    System.out.println("Entered number is = " + numberOfChoice);
                    CircleArea.calculateArea();
                    //break;
                } else if (numberOfChoice == 2) {
                    System.out.println("Entered number is = " + numberOfChoice);
                    CircleRadius.calculateBigger();
                    //break;
                } else if (numberOfChoice == 3) {
                    System.out.println("Entered number is = " + numberOfChoice);
                    AngledTriangle.calculateAngledTriangle();
                    //break;
                } else if (numberOfChoice == 4) {
                    System.out.println("Entered number is = " + numberOfChoice);
                    EvenOrOdd.calculateEvenOrOdd();
                    //break;
                } else
                    System.out.println("You made wrong choice! :( Please try again later!");
                    break;
        } while (numberOfChoice != 0);
                System.out.println("\n" + "Oh-yeah!! Program has worked your choice! Good luck!!");
        //return;
    }
}




