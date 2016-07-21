package lessonworks;

public class MultiDimension {
    public static void main(String[] args) {
        int[][] intArray = new int[5][8];
        for (int j = 0; j < intArray.length; j++) {
            for (int k = 0; k < intArray.length; k++) {
                intArray[j][k] = j * k;
                System.out.print(intArray[j][k]);
            }
            System.out.println();
        }
    }
}
