package com.eduardaliiev.app.methods.objectorientedparadigm.polymorphism;

import java.util.Arrays;
import java.util.Scanner;

public class RandomArrayCreator {

    private static int getOverrideOne;
    private static int getOverrideTwo;


    public static void overloadedCreate() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter arrays Row length: ");
        int sizeRow = scanner.nextInt(); // Вводим с клавиатуры размер массива строки и записываем в size
        System.out.println("Enter arrays Column length: ");
        int sizeColumn = scanner.nextInt(); // Вводим с клавиатуры размер массива ряда и записываем в size

        if (sizeColumn == getOverrideOne) {
            int[] arraysOneNumbers = new int[sizeRow]; // Создаём массив int[] размером в sizeRow
            Overload overload = new Overload();
            System.out.print("\r" + Arrays.toString(overload.create(arraysOneNumbers)));
        } else if (sizeRow != getOverrideTwo){
            int[][] arraysTwoNumbers = new int[sizeRow][sizeColumn]; // Создаём массив int[][] размером в sizeRow и sizeColumn
            Overload overload = new Overload();
            overload.create(arraysTwoNumbers);
        }
    }


    public int[] getOverrideOne() {
        RandomArrayCreator randomArrayParametrized = new RandomArrayCreator();
        return new int[0];
    }
    public int[][] getOverrideTwo() {
        RandomArrayCreator randomArrayParametrized = new RandomArrayCreator();
        return new int[0][];
    }
}


