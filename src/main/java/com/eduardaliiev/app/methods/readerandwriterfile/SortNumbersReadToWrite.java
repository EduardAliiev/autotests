package com.eduardaliiev.app.methods.readerandwriterfile;

import com.eduardaliiev.app.utils.input.ReadFromFileOnlyNumbers;

import java.io.IOException;
import java.util.Scanner;

import static com.eduardaliiev.app.methods.readerandwriterfile.ReaderAndWriterPath.inputPath;

public class SortNumbersReadToWrite {
    public static int[] tempSortSmallToBig() throws IOException {
        Scanner scanner = new Scanner(System.in);

        ReadFromFileOnlyNumbers readLineFromFile = new ReadFromFileOnlyNumbers();
        int[] arraysNumber = readLineFromFile.readFromFile(inputPath);


        boolean swapFlag = true;
        int tempInt;
        int i;
        while (swapFlag) {
            swapFlag = false;
            for (i = 0; i < arraysNumber.length - 1; i++) {
                if (arraysNumber[i] > arraysNumber[i + 1]) {
                    tempInt = arraysNumber[i + 1];
                    arraysNumber[i + 1] = arraysNumber[i];
                    arraysNumber[i] = tempInt;
                    swapFlag = true;
                }
            }
        }
        for (i = arraysNumber.length - 1; i >= 0; i--) {
        }
        return arraysNumber;
    }
}
