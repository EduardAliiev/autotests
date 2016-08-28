package com.eduardaliiev.utils.arrays.objectorientedparadigm.polymorphism;

import java.util.Arrays;
import java.util.Scanner;

public class RandomArrayCreator {

    public static void overloadedCreate() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter array Row length: ");
        int sizeRow = scanner.nextInt(); // Вводим с клавиатуры размер массива строки и записываем в size
        System.out.println("Enter array Column length: ");
        int sizeColumn = scanner.nextInt(); // Вводим с клавиатуры размер массива ряда и записываем в size

        if (sizeColumn == 0) {
            int[] arraysOneNumbers = new int[sizeRow]; // Создаём массив int[] размером в sizeRow
            Overload overload = new Overload();
            System.out.print("\r" + Arrays.toString(overload.create(arraysOneNumbers)));
        } else {
            int[][] arraysTwoNumbers = new int[sizeRow][sizeColumn]; // Создаём массив int[][] размером в sizeRow и sizeColumn
            Overload overload = new Overload();
            System.out.println("\n" + (overload.create(arraysTwoNumbers)) + "\r");
        }
    }


    public int[] getOverrideOne() {
        RandomArrayCreator randomArrayParametrized = new RandomArrayCreator();
        return new int[0];
    }
    public int[][] getOverrideTwo() {
        return new int[0][];
    }
}


