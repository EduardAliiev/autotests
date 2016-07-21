package com.eduardaliiev.arrays.loops;

import java.util.Scanner;

public class ArrayOfRandomIntegerNumbersFrom0To9 {
    public static void calculateLoopNumbers() {


        Scanner scanner = new Scanner(System.in);

        int[] number = {1};
        for (int A = 0; A <= 9; A++) {
            number[A] = A;
            System.out.print((A) + ",");
        }
    }
}
