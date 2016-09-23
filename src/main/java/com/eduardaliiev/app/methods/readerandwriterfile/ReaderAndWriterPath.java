package com.eduardaliiev.app.methods.readerandwriterfile;

public class ReaderAndWriterPath {

    protected static String inputPath;
    protected static String outputPath;

    public ReaderAndWriterPath(String inputPath, String outputPath) {
        ReaderAndWriterPath.inputPath = inputPath;
        ReaderAndWriterPath.outputPath = outputPath;
    }

    public ReaderAndWriterPath() {
        inputPath = "com/eduardaliiev/app/resources/input.txt";
        outputPath = "com/eduardaliiev/app/resources/output.txt";
    }

    public static String getInputPath() {
        return inputPath;
    }

    public static String getOutputPath() {
        return outputPath;
    }

}
