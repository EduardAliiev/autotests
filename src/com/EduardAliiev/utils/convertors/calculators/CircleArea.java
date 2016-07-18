package com.EduardAliiev.utils.convertors.calculators;

import java.util.Scanner;

public class CircleArea {
    public static final double PI = 3.14d;
    public static void calculateArea() {
            Scanner scanner = new
                    Scanner(System.in);
            System.out.println("Enter the radius (r) r = ");
            double radius = scanner.nextDouble();
            System.out.println("\n" + "Entered number is = " + radius);
            double circleArea = PI * radius * radius;
            System.out.println("\n" + "Larger Area of a circle is equal to " + circleArea);
        }
}
