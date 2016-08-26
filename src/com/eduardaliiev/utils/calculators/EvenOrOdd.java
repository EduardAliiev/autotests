package com.eduardaliiev.utils.calculators;

import java.util.Scanner;

public class EvenOrOdd {

    public static void calculateEvenOrOdd() {
        Scanner scanner = new
                Scanner(System.in);
        System.out.println("\n" + "Enter any integer number");
        int n = scanner.nextInt();
        if (n % 2 == 0) {
            System.out.println("\n" + "Number is " + n + " even.");
        } else {
            System.out.println("\n" + "Number is " + n + " odd.");
        }
    }
}
