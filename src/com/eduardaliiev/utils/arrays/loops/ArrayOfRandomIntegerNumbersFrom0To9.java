package com.eduardaliiev.utils.arrays.loops;

import java.util.Random;
import java.util.Scanner;

public class ArrayOfRandomIntegerNumbersFrom0To9 {
    public static void calculateLoopNumbers() {
        Scanner scanner = new Scanner(System.in);
        int evenNumbers = 0;
        int[] arraysNumber = new int[5];
        for (int i = 0; i < arraysNumber.length; i++) {
            Random numbers = new Random();
            arraysNumber[i] = numbers.nextInt(10);
            System.out.print(arraysNumber[i] + " ");
            if (arraysNumber[i] >= 0 && arraysNumber[i] % 2 == 0) evenNumbers++;
        }
        System.out.println("\n" + "There is " + evenNumbers + " even numbers in array!");
    }
}

