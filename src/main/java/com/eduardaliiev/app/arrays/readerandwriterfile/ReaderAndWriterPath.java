package com.eduardaliiev.app.arrays.readerandwriterfile;

public class ReaderAndWriterPath {

    protected static String inputPath;
    protected static String outputPath;

    public ReaderAndWriterPath(String inputPath, String outputPath) {
        ReaderAndWriterPath.inputPath = inputPath;
        ReaderAndWriterPath.outputPath = outputPath;
    }

    public ReaderAndWriterPath() {
        inputPath = "/Users/edikaliiev/Desktop/input.txt";
        outputPath = "/Users/edikaliiev/Desktop/output.txt";
    }

    public static String getInputPath() {
        return inputPath;
    }

    public static String getOutputPath() {
        return outputPath;
    }

}
