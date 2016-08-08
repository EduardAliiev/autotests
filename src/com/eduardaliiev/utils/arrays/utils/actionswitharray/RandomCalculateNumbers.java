package com.eduardaliiev.utils.arrays.utils.actionswitharray;

import java.util.Random;

public class RandomCalculateNumbers {

    public int[] randomCalculate(int arrays1Number[]) {

        int i = 0;
        Random numbers = new Random();
        arrays1Number[i] = numbers.nextInt(10);
        System.out.print(arrays1Number[i] + " ");

        return arrays1Number;
    }
}




   /* RandomCalculateNumbers randomCalculateNumbers = new RandomCalculateNumbers();
randomCalculateNumbers.randomCalculate(arraysNumber);*/