package com.eduardaliiev.app.methods.arrays.loops;


import java.util.Random;

public class ArrayOfRandomIntegerMaxMinNumbersFrom0To999 {
    public static void calculateLoopNumbers() {
        int arraysNumber[] = new int[15];
        int i = 0;
        while (i < arraysNumber.length) {
            Random numbers = new Random();
            arraysNumber[i] = numbers.nextInt(999);
            System.out.print(arraysNumber[i] + " ");  // output of arrays line
            i++;
        }
        int min = arraysNumber[0];
        int max = arraysNumber[0];
        for (int anArraysNumber : arraysNumber) {         // for-Each
            if (anArraysNumber < min)
                min = anArraysNumber;
            if (anArraysNumber > max)
                max = anArraysNumber;
        }
        System.out.println("\n" + "==========================================================" +
                "\n" + "Min number " + min + "\n" + "Max number " + max);
    }
}

