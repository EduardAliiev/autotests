package com.eduardaliiev.utils.calculators;

import java.util.Scanner;

public class CircleRadius {
    public static void calculateBigger() {
        final double PI = 3.14d;
        double radius1 = 0;
        double radius2 = 0;
        Scanner scanner = new Scanner(System.in);
        do{
            System.out.println("\n" + "Enter the radius_1 (r1) of the circle r1 = ");
            radius1 = scanner.nextDouble();
            System.out.println("Enter the radius_2 (r2) of the circle r2 = ");
            radius2 = scanner.nextDouble();

            if (radius1 == radius2) {
                System.out.println("\n" + "Please try again and enter uneven values the radius!");
            } else if (radius1 >= radius2) {
                double circleArea = PI * radius1 * radius1;
                System.out.println("Larger Area1 of a circle is equal to " + circleArea);
            } else if (radius1 <= radius2) {
                double circleArea = PI * radius2 * radius2;
                System.out.println("Larger Area2 of a circle is equal to " + circleArea);
            }
        } while (radius1 == radius2);
    }
}










