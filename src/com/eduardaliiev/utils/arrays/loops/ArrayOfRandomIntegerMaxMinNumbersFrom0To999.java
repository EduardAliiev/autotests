package com.eduardaliiev.utils.arrays.loops;


import java.util.Random;
import java.util.Scanner;

public class ArrayOfRandomIntegerMaxMinNumbersFrom0To999 {
    public static void calculateLoopNumbers() {
        Scanner scanner = new Scanner(System.in);
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
        for (int anArraysNumber : arraysNumber) {         // forEach
            if (anArraysNumber < min)
                min = anArraysNumber;
            if (anArraysNumber > max)
                max = anArraysNumber;
        }
        System.out.println("\n" + "==========================================================" +
                "\n" + "Min number " + min + "\n" + "Max number " + max);
    }
}

