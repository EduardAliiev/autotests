package com.eduardaliiev.utils.arrays.loops;

public class EvenNumbersFrom2To20 {
    public static void calculateLoopNumbers() {
        int A = 1;
        int B = 1;
        while (A <= 10) {
            System.out.print(A * 2 + " ");
            ++A;
        } System.out.println(" ");
        while (B <= 10) {
            System.out.println(B * 2);
            ++B;
        }
    }
}

