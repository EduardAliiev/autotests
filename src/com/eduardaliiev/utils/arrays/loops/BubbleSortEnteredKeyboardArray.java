package com.eduardaliiev.utils.arrays.loops;

import java.util.Arrays;
import java.util.Scanner;

public class BubbleSortEnteredKeyboardArray {

    public static void calculateLoopBubbleSort() {

       // final int BOLWEmenwe = 0;
        //final  int menweBOLWE = 1;

        Scanner scanner = new Scanner(System.in);
        int j;


        System.out.print("Please, enter size of the array: ");

        int size = scanner.nextInt();
        int[] arraysNumber = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.print("Element of the array: ");
            arraysNumber[i] = scanner.nextInt();
        }
        System.out.println("\n" + "0 - От меньшего к большему" +
                "\n" + "1 - От большего к меньшему");

     //   if (menweBOLWE == BOLWEmenwe) {
       //     System.out.println("IF & ELSE: BubbleSort");
       // } else if (BOLWEmenwe == menweBOLWE) {
        //    System.out.println("IF & ELSE: BubbleSort");
       // }


        int numberOfExempls = (int) scanner.nextDouble();
                switch (numberOfExempls) {
            case 0:
                System.out.println( "BB->MM");
                BubbleSort.calculateLoopBubbleSort();
                break;
            case 1:
                System.out.println("MM->BB");
                BubbleSort.calculateLoopBubbleSort();
                break;
            default:
                System.out.println("exitus");
                break;
        }
        System.out.print("\n" + "Original array:" + Arrays.toString(arraysNumber) + "\n ");
        System.out.print("Sorted array: ");
    }
}



