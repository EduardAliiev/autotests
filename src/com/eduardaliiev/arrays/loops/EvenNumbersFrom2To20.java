package com.eduardaliiev.arrays.loops;

import java.util.Scanner;

public class EvenNumbersFrom2To20 {
    public static void calculateLoopNumbers() {
        int i = 1;
        int j = 1;
        Scanner scanner = new Scanner(System.in);
        while (i <= 10) {
            System.out.print(i * 2 + " ");
            ++i;
        }
        System.out.println(" ");
        while (j <= 10) {
            System.out.println(j * 2);
            ++j;
        }

    }
}

