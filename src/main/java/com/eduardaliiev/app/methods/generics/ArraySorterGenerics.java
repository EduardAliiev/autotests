package com.eduardaliiev.app.methods.generics;

import java.util.Arrays;

public class ArraySorterGenerics<K extends Number> {
    K[] k;

  public static void genericsCreate() {

        Integer[] arraysNumber = new Integer[15];

        for (int i = 0; i < arraysNumber.length; i++) {
            arraysNumber[i] = (arraysNumber.length - i);
        }

        System.out.println(Arrays.toString((arraysNumber)));
        ArraySorterGenerics<Integer> arraySorterGenerics = new ArraySorterGenerics<Integer>(arraysNumber);
        arraySorterGenerics.sort();
        System.out.println(Arrays.toString(arraySorterGenerics.getK()));
    }

    private ArraySorterGenerics(K[] k) {
        this.k = k;
    }

    public void sort() {
        this.k = staticSort(k);
    }

    public K[] getK() {
        return k;
    }

    public static <K extends Number> K[] staticSort(K[] k) {
        for (int i = 0; i < k.length - 1; i++) {
            K temp;
            for (int j = 1; j < k.length - i; j++) {
                if (k[j - 1].intValue() > k[j].intValue()) {
                    temp = k[j - 1];
                    k[j - 1] = k[j];
                    k[j] = temp;
                }
            }
        }
        return k;
    }
}



