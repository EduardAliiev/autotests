package com.EduardAliiev.utils.convertors.calculators;

import java.util.Scanner;

public class AngledTriangle {

    static int A, B, C;

    public static void calculateAngledTriangle() {

        Scanner scanner = new
                Scanner(System.in);
        System.out.println("Enter the side angled triangle A =");
        A = scanner.nextInt();
        System.out.println("Enter the side angled triangle B =");
        B = scanner.nextInt();

            C = (A * A) + (B * B);

        if (C > A && C > B || A >= B && B >= A) {
            System.out.println("Side angled triangle equal C =" + C * C);
            }
    }
}
