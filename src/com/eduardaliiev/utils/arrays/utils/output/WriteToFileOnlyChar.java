package com.eduardaliiev.utils.arrays.utils.output;

import com.eduardaliiev.utils.arrays.readerandwriterfile.ReaderAndWriterPath;
import com.eduardaliiev.utils.arrays.readerandwriterfile.SortNumbers;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class WriteToFileOnlyNumbers extends ReaderAndWriterPath {

    public static void writeToFile(String outputPath)
            throws IOException {
       SortNumbers sortNumbers = new SortNumbers();            // вызываем класс SortNumbers
        int[] numbersToString = SortNumbers.tempSortSmallToBig();   //присваиваем полученное значение с класса SortNumbers

        String stringArrays = Arrays.toString(numbersToString);         // переводим массив int[] в String

        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(
                new FileOutputStream(getOutputPath())));                        // запись значений в файл
        writer.append(stringArrays);
        writer.newLine();
        System.out.println("\n\nThe sorted data are written to the file: " + stringArrays);
        writer.close();
    }
}