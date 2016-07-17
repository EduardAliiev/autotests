package com.EduardAliiev.utils.convertors.calculators;

import java.util.Scanner;

public class CircleRadius
{
    public static void calculateBigger() {
        final double PI = 3.14d;

        Scanner scanner = new
                Scanner(System.in);
        System.out.println("Enter the radius_1 (r1) of the circle r1 = ");
        double radius1 = scanner.nextDouble();
        System.out.println("Enter the radius_2 (r2) of the circle r2 = ");
        double radius2 = scanner.nextDouble();

        if (radius1 == radius2) {
            System.out.println("Please try again and enter uneven values the radius:");
        } else if (radius1 >= radius2) {
            double circleArea = PI * radius1 * radius1;
            System.out.println("Larger Area1 of a circle is equal to " + circleArea);
        } else if (radius1 <= radius2) {
           double circleArea = PI * radius2 * radius2;
           System.out.println("Larger Area2 of a circle is equal to " + circleArea);
        }
    }
}








