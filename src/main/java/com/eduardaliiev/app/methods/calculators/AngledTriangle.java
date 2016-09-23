package com.eduardaliiev.app.methods.calculators;

import java.util.Scanner;

public class AngledTriangle {

    public static int calculateAngledTriangle() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\n" + "Enter the side angled triangle A = ");
        int A = scanner.nextInt();
        System.out.println("Enter the side angled triangle B = ");
        int B = scanner.nextInt();
        int C = (A * A) + (B * B);
        if (C > A && C > B || A >= B && B >= A) {
            System.out.println("\n" + "Side angled triangle equal C = " + C * C);
        }
        return (C*C);
    }
}
