package com.eduardaliiev.app.utils.output;

import com.eduardaliiev.app.methods.readerandwriterfile.ReaderAndWriterPath;
import com.eduardaliiev.app.methods.readerandwriterfile.SortNumbersReadToWrite;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class WriteToFileOnlyNumbers extends ReaderAndWriterPath {

    public static void writeToFile(String outputPathWriteToFileOnlyNumbers)
            throws IOException {
       SortNumbersReadToWrite sortNumbers = new SortNumbersReadToWrite();            // вызываем класс SortNumbersReadToWrite
        int[] numbersToString = SortNumbersReadToWrite.tempSortSmallToBig();   //присваиваем полученное значение с класса SortNumbersReadToWrite

        String stringArrays = Arrays.toString(numbersToString);         // переводим массив int[] в String

        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(
                new FileOutputStream(getOutputPath())));                        // запись значений в файл
        writer.append(stringArrays);
        writer.newLine();
        System.out.println("\n\nThe sorted data are written to the file: " + stringArrays);
        writer.close();
    }
}
