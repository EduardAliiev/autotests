package lessonworks.recordreadingfile.Two;

public class InputOutputPathToFile {

    static String inputPath;
    private static String outputPath;

    public InputOutputPathToFile(String inputPath, String outputPath) {
        this.inputPath = inputPath;
        this.outputPath = outputPath;
    }

    public InputOutputPathToFile() {
        this.inputPath = "/Users/edikaliiev/Desktop/input.txt";
        this.outputPath = "/Users/edikaliiev/Desktop/output.txt";
    }

    public static String getInputPath() {
        return inputPath;
    }

    public static String getOutputPath() {
        return outputPath;
    }

}
