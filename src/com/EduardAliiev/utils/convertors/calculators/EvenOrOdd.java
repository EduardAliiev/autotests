package com.EduardAliiev.utils.convertors.calculators;

import java.util.Scanner;

public class EvenOrOdd {

    public static void calculateEvenOrOdd() {

        Scanner scanner = new
                Scanner(System.in);
        System.out.println("Enter any integer number");
        int n = scanner.nextInt();

        if (n % 2 == 0) {
            System.out.println("Number is " + n + " even");
        } else {
            System.out.println("Number is " + n + " odd");
        }
    }
}
