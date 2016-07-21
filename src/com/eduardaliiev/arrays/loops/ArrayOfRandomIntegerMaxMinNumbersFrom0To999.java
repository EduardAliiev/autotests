package com.eduardaliiev.arrays.loops;


import java.util.Random;
import java.util.Scanner;

public class ArrayOfRandomIntegerMaxMinNumbersFrom0To999 {
    public static void calculateLoopNumbers() {
        Scanner scanner = new Scanner(System.in);
        int[] arraysNumber = new int[15];
        int max = arraysNumber[0];
        int min = arraysNumber[0];
        for (int i = 0; i < arraysNumber.length; i++) {
            Random numbers = new Random();
            arraysNumber[i] = numbers.nextInt(999);
            System.out.print(arraysNumber[i] + " ");  // output of arrays line
            if (arraysNumber[i] < min)
                min = arraysNumber[i];
            if (arraysNumber[i] > max)
                max = arraysNumber[i];
        }
        System.out.println("\n" + "Min number " + min + "\n" + "Max number " + max);
    }
}

