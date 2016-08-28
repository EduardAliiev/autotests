package com.eduardaliiev.utils.arrays.objectorientedparadigm.polymorphism;

import com.eduardaliiev.utils.arrays.utils.actionswitharray.RandomCalculateOneArrayNumbers;
import com.eduardaliiev.utils.arrays.utils.actionswitharray.RandomCalculateTwoArrayNumbers;

public class Overload {
        // public void create(int[] arraysOneNumbers) {

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

