package com.eduardaliiev.app.arrays.loops;

public class OddNumbersFrom1To99AndBack {
    public static void calculateLoopNumbers() {
        int A = 0;
        int B = 100;
        while (A <= 99) {
            System.out.print((A += 1) + " ");
            ++A;
        } System.out.println(" ");
        while (B >= 2) {
            System.out.print((B -= 1) + " ");
            --B;
        }
    }
}