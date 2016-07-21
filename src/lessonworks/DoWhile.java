package lessonworks;


import java.util.Scanner;

public class DoWhile {

    public static void main(String args[]) {


        Scanner scanner = new Scanner(System.in);
        int A = (int) scanner.nextDouble();
        int B = (int) scanner.nextDouble();

        if (A <= B) {

            do{
                System.out.println("\n" + " A1 = " + A + " B1 = " + B);
                A = A - 1;
            } while (A > B);

        } else {
        }
        System.out.println("\n" + " A2 = " + A + " B2 = " + B);
    }
}
