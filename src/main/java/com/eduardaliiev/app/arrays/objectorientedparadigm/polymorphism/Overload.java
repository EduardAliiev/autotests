package com.eduardaliiev.app.arrays.objectorientedparadigm.polymorphism;

import com.eduardaliiev.app.arrays.utils.actionswitharray.RandomCalculateOneArrayNumbers;
import com.eduardaliiev.app.arrays.utils.actionswitharray.RandomCalculateTwoArrayNumbers;

public class Overload {

    int[] create(int[] arraysOneNumbers) {
        RandomCalculateOneArrayNumbers randomCalculateNumbers = new RandomCalculateOneArrayNumbers();
        randomCalculateNumbers.randomCalculate(arraysOneNumbers);
        return arraysOneNumbers;
    }

    int[][] create(int[][] arraysTwoNumbers) {
        RandomCalculateTwoArrayNumbers randomCalculateNumbers = new RandomCalculateTwoArrayNumbers();
        randomCalculateNumbers.randomCalculate(arraysTwoNumbers);
        return arraysTwoNumbers;
    }
}

